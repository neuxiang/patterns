/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.factoryMethod
 * 
 * 文件名称 Client.java
 * 
 */
package com.example.pattern.build.factoryMethod;

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
        Creator cre1 = new ConcreteCreator();
        Product prod1 = cre1.FactoryMethod();
    }
}
