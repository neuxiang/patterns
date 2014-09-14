/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.strategy
 * 
 * 文件名称 Context.java
 * 
 */
package com.niufish.pattern.behavioral.strategy;

/**
 * 环境角色，持有一个Strategy的引用
 * <p>
 * <a href="Context.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Context {
    
    /**
	 * 持有的策略对象
	 * @uml.property  name="_strategy"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    private Strategy _strategy;
    
    /**
     * 用于初始化持有的对象
     * @param strategy 实例化的策略对象
     */
    public Context(Strategy strategy){
        _strategy = strategy;
    }
    
    /**
     * 设置持有的对象
     * @param _strategy 实例化的策略对象
     */
    public void setStrategy(Strategy _strategy) {
        this._strategy = _strategy;
    }

    /**
     * 策略方法
     */
    public void contextInterface(){
        _strategy.algorithmInterface();
    }
    
}
