/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.composite.safe
 * 
 * 文件名称 Client.java
 * 
 */
package com.niufish.pattern.structure.composite.safe;

/**
 * 测试类
 * <p>
 * <a href="Client.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Client {
    
    public static void main(String[] args) {
        Component c = new Composite();
        c.getComposite().add(new Leaf());
        c.getComposite().add(new Leaf());
        
        Component c2 = new Composite();
        c2.getComposite().add(new Leaf());
        
        c.getComposite().add(c2);
        
        c.operation();
    }
}
