/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.command
 * 
 * 文件名称 Client.java
 * 
 */
package com.niufish.pattern.behavioral.command;

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
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
