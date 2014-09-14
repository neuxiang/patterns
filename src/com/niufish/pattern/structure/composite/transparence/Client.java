/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.composite.safe
 * 
 * 文件名称 Client.java
 * 
 */
package com.niufish.pattern.structure.composite.transparence;

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
        Component l1 = new Leaf();
        l1.add(new Leaf());//此句话没有任何意义
        c.add(l1);
        c.add(new Leaf());
        
        Component c2 = new Composite();
        c2.add(new Leaf());
        
        c.add(c2);
        
        c.operation();
    }
}
