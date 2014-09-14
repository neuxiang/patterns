package test.xstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


/**
 * ���xml�ͽ���xml�Ĺ�����
 *@ClassName:XmlUtil
 *@author: chenyoulong  Email: chen.youlong@payeco.com
 *@date :2012-9-29 ����9:51:28
 *@Description:TODO
 */
public class XmlUtil{
	/**
	 * java ת����xml
	 * @Title: toXml 
	 * @Description: TODO 
	 * @param obj ����ʵ��
	 * @return String xml�ַ���
	 */
	public static String toXml(Object obj){
		XStream xstream=new XStream();
//		XStream xstream=new XStream(new DomDriver()); //ֱ����jaxp dom������
//		XStream xstream=new XStream(new DomDriver("utf-8")); //ָ�����������,ֱ����jaxp dom������
		
		////���û����䣬xml�еĸ�Ԫ�ػ���<��.����>������˵��ע�������û��Ч�����Ե�Ԫ���������������
		xstream.processAnnotations(obj.getClass()); //ͨ��ע�ⷽʽ�ģ�һ��Ҫ����仰
		return xstream.toXML(obj);
	}
	
	/**
	 *  ������xml�ı�ת����Java����
	 * @Title: toBean 
	 * @Description: TODO 
	 * @param xmlStr
	 * @param cls  xml��Ӧ��class��
	 * @return T   xml��Ӧ��class���ʵ������
	 * 
	 * ���õķ���ʵ����PersonBean person=XmlUtil.toBean(xmlStr, PersonBean.class);
	 */
	public static <T> T  toBean(String xmlStr,Class<T> cls){
		//ע�⣺����new Xstream(); ���򱨴�java.lang.NoClassDefFoundError: org/xmlpull/v1/XmlPullParserFactory
		XStream xstream=new XStream(new DomDriver());
		xstream.processAnnotations(cls);
		T obj=(T)xstream.fromXML(xmlStr);
		return obj;			
	} 

   /**
     * д��xml�ļ���ȥ
     * @Title: writeXMLFile 
     * @Description: TODO 
     * @param obj ����
     * @param absPath ����·��
     * @param fileName	�ļ���
     * @return boolean
     */
  
    public static boolean toXMLFile(Object obj, String absPath, String fileName ){
    	String strXml = toXml(obj);
    	String filePath = absPath + fileName;
    	File file = new File(filePath);
    	if(!file.exists()){
    		try {
				file.createNewFile();
			} catch (IOException e) {
				return false ;
			}
    	}// end if 
    	OutputStream ous = null ;
		try {
			ous = new FileOutputStream(file);
			ous.write(strXml.getBytes());
			ous.flush();
		} catch (Exception e1) {
			return false;
		}finally{
			if(ous != null )
				try {
					ous.close();
				} catch (IOException e) {
				}
		}
		return true ;
    }
    
    /**
     * ��xml�ļ���ȡ����
     * @Title: toBeanFromFile 
     * @Description: TODO 
     * @param absPath ����·��
     * @param fileName �ļ���
     * @param cls
     * @throws Exception 
     * @return T
     */
    public static <T> T  toBeanFromFile(String absPath, String fileName,Class<T> cls) throws Exception{
    	String filePath = absPath +fileName;
    	InputStream ins = null ;
    	try {
    		ins = new FileInputStream(new File(filePath ));
		} catch (Exception e) {
			throw new Exception("��{"+ filePath +"}�ļ�ʧ�ܣ�", e);
		}
    	
//    	String encode = useEncode(cls);
    	String encode = "";
		XStream xstream=new XStream(new DomDriver(encode));
		xstream.processAnnotations(cls);
		T obj =null;
		try {
			obj = (T)xstream.fromXML(ins);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception("����{"+ filePath +"}�ļ�ʧ�ܣ�",e);
		}
		if(ins != null)
			ins.close();
		return obj;			
    } 
	
}
