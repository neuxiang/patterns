/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.mediator
 * 
 * 文件名称 Mediator.java
 * 
 */
package com.niufish.pattern.behavioral.mediator;

/**
 * 抽象的调停者角色<br />
 * 这个接口感觉没有什么存在的必要
 * <p>
 * <a href="Mediator.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Mediator {
    
    /**
     * 示意性的商业方法<br />
     * 表现在调停者这里可以协调各同事类的动作
     */
    void doSomething();
    
    
}
