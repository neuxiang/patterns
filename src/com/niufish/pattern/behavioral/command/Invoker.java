/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.command
 * 
 * 文件名称 Invoker.java
 * 
 */
package com.niufish.pattern.behavioral.command;

/**
 * 请求者，负责调用命令对象执行请求
 * <p>
 * <a href="Invoker.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Invoker {
    
    /**
	 * 持有的命令对象
	 * @uml.property  name="_command"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    private Command _command;
    
    /**
     * 初始化持有的命令对象
     * @param command 命令对象
     */
    public Invoker(Command command){
        _command = command;
    }
    
    /**
     * 行动方法
     */
    public void action(){
        _command.execute();
    }

}
