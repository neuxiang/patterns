/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.state
 * 
 * 文件名称 Client.java
 * 
 */
package com.niufish.pattern.state;

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
        Context c = new Context();
        c.setState(new ConcreteStateA());//开始跑
        c.request();
        c.setState(new ConcreteStateB());//开始走
        c.request();
    }
}
