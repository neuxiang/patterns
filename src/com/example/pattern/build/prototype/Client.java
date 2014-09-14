/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.prototype
 * 
 * 文件名称 Client.java
 * 
 */
package com.example.pattern.build.prototype;

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
        ConcretePrototype1 cp1a = new ConcretePrototype1();
        cp1a.setType("fish");
        ConcretePrototype1 cp1b = (ConcretePrototype1)cp1a.clone();
        System.out.println(cp1b.getType());

        ConcretePrototype2 cp2a = new ConcretePrototype2();
        cp2a.setName("kingfish");
        ConcretePrototype2 cp2b = (ConcretePrototype2)cp2a.clone();
        System.out.println(cp2b.getName());
    }
}
