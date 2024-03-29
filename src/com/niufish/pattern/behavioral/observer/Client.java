/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.observer
 * 
 * 文件名称 Client.java
 * 
 */
package com.niufish.pattern.behavioral.observer;

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
        ConcreteSubject cs = new ConcreteSubject();
        ConcreteObserver co = new ConcreteObserver(cs);
        cs.setData("hello");
    }
}
