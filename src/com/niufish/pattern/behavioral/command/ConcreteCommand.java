/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.command
 * 
 * 文件名称 ConcreteCommand.java
 * 
 */
package com.niufish.pattern.behavioral.command;

/**
 * 具体命令角色，定义一个接收者和行为之间的弱耦合，实现execute方法，负责调用接收者的相应操作。
 * <p>
 * <a href="ConcreteCommand.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteCommand implements Command {
    
    /**
	 * 持有的接收者对象
	 * @uml.property  name="_receiver"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    private Receiver _receiver;
    
    /**
     * 初始化持有的接收者对象
     * @param receiver 接收者对象
     */
    public ConcreteCommand(Receiver receiver){
        _receiver = receiver;
    }
    /**
     * @see com.niufish.pattern.behavioral.command.Command#execute()
     */
    public void execute() {
        _receiver.action();
    }
    
    /**
     * @see com.niufish.pattern.behavioral.command.Command#unexecute()
     */
    public void unexecute() {
    }

}
