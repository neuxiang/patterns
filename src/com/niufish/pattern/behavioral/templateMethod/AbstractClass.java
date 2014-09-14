/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.templateMethod
 * 
 * 文件名称 AbstractClass.java
 * 
 */
package com.niufish.pattern.behavioral.templateMethod;

/**
 * 抽象模版角色
 * <p>
 * <a href="AbstractClass.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public abstract class AbstractClass {
    
    /**
     * 模版方法<br />
     * 给出逻辑的骨架
     */
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
    }

    /**
     * 基本操作1，子类须实现
     */
    protected abstract void primitiveOperation1();

    /**
     * 基本操作2，子类须实现
     */
    protected abstract void primitiveOperation2();

}
