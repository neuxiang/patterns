/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.command
 * 
 * 文件名称 Command.java
 * 
 */
package com.niufish.pattern.behavioral.command;

/**
 * 声明了一个给出所有具体命令类的抽象接口
 * <p>
 * <a href="Command.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Command {
    
    /**
     * 执行的抽象
     */
    void execute();
    
    /**
     * 取消的抽象
     * TODO 完成取消执行的代码
     */
    void unexecute();
    
}
