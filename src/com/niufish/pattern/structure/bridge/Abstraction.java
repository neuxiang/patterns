/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.bridge
 * 
 * 文件名称 Abstraction.java
 * 
 */
package com.niufish.pattern.structure.bridge;

/**
 * 对抽象做出定义，并定义实现的引用
 * <p>
 * <a href="Abstraction.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public abstract class Abstraction {
    
    /**
	 * 实现
	 */
    private Implementor _imp = null;
    
    /**
     * 与实现挂钩
     * @param imp
     */
    public Abstraction(Implementor imp){
        _imp = imp;
    }
    
    protected void print(String str){
        _imp.operationImp(str);
    }
    
    /**
     * 操作
     */
    public abstract void operation();
}
