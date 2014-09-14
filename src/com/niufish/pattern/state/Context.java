/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.state
 * 
 * 文件名称 Context.java
 * 
 */
package com.niufish.pattern.state;

/**
 * 环境角色
 * <p>
 * <a href="Context.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Context {
    
    /**
	 * 持有的状态
	 * @uml.property  name="_state"
	 * @uml.associationEnd  
	 */
    private State _state;
    
    /**
     * 某些操作
     */
    public void request(){
        _state.Handle();
    }
    
    /**
     * 改变状态
     * @param state 状态
     */
    public void setState(State state){
        _state = state;
    }

}
