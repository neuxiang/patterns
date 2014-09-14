/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.decorator
 * 
 * 文件名称 Client.java
 * 
 */
package com.niufish.pattern.structure.decorator;

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
        Component comp = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponent()));
        comp.operation();
    }
}
