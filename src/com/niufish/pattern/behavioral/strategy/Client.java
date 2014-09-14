/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.strategy
 * 
 * 文件名称 Client.java
 * 
 */
package com.niufish.pattern.behavioral.strategy;

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
        ConcreteStrategyC csc = new ConcreteStrategyC();
        Context c = new Context(csc);
        c.contextInterface();
        c.setStrategy(new ConcreteStrategyB());
        c.contextInterface();
        c.setStrategy(new ConcreteStrategyA());
        c.contextInterface();
    }
}
