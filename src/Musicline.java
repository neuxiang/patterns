
import java.awt.Graphics;
import java.awt.GridLayout;
import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;
import javax.swing.GroupLayout;
import javax.swing.JFrame;

/**
* 
*/

/**
* @author Administrator
* 
*/
public class Musicline extends JFrame implements Runnable {

private byte[] audioData = null;

private int intBytes = 0;

private byte[] ml = new byte[1];

private int[] drawl = null;

/** Creates new form Musicline */
public Musicline() {
initComponents();
Graphics g;
g = this.getGraphics();
}

public void paint(Graphics g) {
g.clearRect(0, 0, 900, 900);
// System.out.print(drawl.length);
if (audioData != null) {
drawl = new int[audioData.length];
for (int i = 0; i < audioData.length; i++) {
ml[0] = audioData[i];
// String s=new String(ml);
drawl[i] = Math.abs((int) ml[0]);
}
System.out.println(drawl[0]);
for (int i = 0; i < drawl.length - 1; i++) {
g.drawLine(i * this.getWidth() / 256, drawl[i] + 100, (i + 1)
* this.getWidth() / 256, drawl[i + 1] + 100);
}
}

}

/*
* (non-Javadoc)
* 
* @see java.lang.Runnable#run()
*/
public void run() {
// TODO Auto-generated method stub
while (intBytes != -1) {
try {
synchronized (this) {
this.wait(10);
}
} catch (InterruptedException ex) {
ex.printStackTrace();
}
repaint();
}
}

public void play() {
try {

AudioInputStream ais = AudioSystem.getAudioInputStream(new File(
"E:/2011-09-14_18-10.wav"));// 获得音频输入流
ais = AudioSystem.getAudioInputStream(
AudioFormat.Encoding.PCM_SIGNED, ais);
AudioFormat baseFormat = ais.getFormat();// 指定声音流中特定数据安排
System.out.println("baseFormat=" + baseFormat);
DataLine.Info info = new DataLine.Info(SourceDataLine.class,
baseFormat);
System.out.println("info=" + info);
SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);
// 从混频器获得源数据行
System.out.println("line=" + line);
line.open(baseFormat);// 打开具有指定格式的行，这样可使行获得所有所需的系统资源并变得可操作。
line.start();// 允许数据行执行数据 I/O
int BUFFER_SIZE = 256;

audioData = new byte[BUFFER_SIZE];
while (intBytes != -1) {
intBytes = ais.read(audioData, 0, BUFFER_SIZE);// 从音频流读取指定的最大数量的数据字节，并将其放入给定的字节数组中。
if (intBytes >= 0) {
int outBytes = line.write(audioData, 0, intBytes);// 通过此源数据行将音频数据写入混频器。
}
}

} catch (Exception e) {
e.printStackTrace();
}
}

/**
* This method is called from within the constructor to initialize the form.
* WARNING: Do NOT modify this code. The content of this method is always
* regenerated by the Form Editor.
*/
// <editor-fold defaultstate="collapsed" desc=" 生成的代码 ">
private void initComponents() {

setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(layout.createParallelGroup(
javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400,
Short.MAX_VALUE));
layout.setVerticalGroup(layout.createParallelGroup(
javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 300,
Short.MAX_VALUE));
pack();
}// </editor-fold>

/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
Musicline msl=new Musicline(); 
msl.setVisible(true); 
Thread yh=new Thread(msl); 
yh.start(); 
msl.play(); 
}

// 变量声明 - 不进行修改 
// 变量声明结束 

} 