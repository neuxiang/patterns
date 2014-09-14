/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.templateMethod
 * 
 * 文件名称 Client.java
 * 
 */
package com.niufish.pattern.behavioral.templateMethod;

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
        AbstractClass ac = new ConcreteClass();
        ac.templateMethod();
    }
}
