/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.strategy
 * 
 * 文件名称 ConcreteStrategyA.java
 * 
 */
package com.niufish.pattern.behavioral.strategy;

/**
 * 具体策略角色C，包装相关的算法和行为
 * <p>
 * <a href="ConcreteStrategyC.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteStrategyC implements Strategy {

    /**
     * @see com.niufish.pattern.behavioral.strategy.Strategy#algorithmInterface()
     */
    public void algorithmInterface() {
        System.out.println("ConcreteStrategyC");
    }

}
