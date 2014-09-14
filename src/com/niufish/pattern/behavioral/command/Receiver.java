/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.command
 * 
 * 文件名称 Receiver.java
 * 
 */
package com.niufish.pattern.behavioral.command;

/**
 * 接收者，负责具体实施和执行一个请求。任何一个类都可以成为接收者，实施和执行请求的方法叫做行动方法。
 * <p>
 * <a href="Receiver.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Receiver {
    
    /**
     * 行动方法
     */
    public void action(){
        System.out.println("Action has been taken");
    }

}
