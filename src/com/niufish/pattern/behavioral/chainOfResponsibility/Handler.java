/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.chainOfResponsibility
 * 
 * 文件名称 Handler.java
 * 
 */
package com.niufish.pattern.behavioral.chainOfResponsibility;

/**
 * 抽象处理者角色
 * <p>
 * <a href="Handler.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public abstract class Handler {
    
    /**
	 * 持有的下家
	 * @uml.property  name="_successor"
	 * @uml.associationEnd  
	 */
    protected Handler _successor;
    
    /**
     * 调用此方法处理请求
     */
    public abstract void handleRequest();
    
    /**
     * 设置下家
     * @param successor 下家
     */
    public void setSuccessor(Handler successor){
        _successor = successor;
    }
    
    /**
     * 得到下家
     * @return 下家
     */
    public Handler getSuccessor(){
        return _successor;
    }
    
}
