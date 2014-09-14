/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.bridge
 * 
 * 文件名称 ConcreteImplementorA.java
 * 
 */
package com.niufish.pattern.structure.bridge;

/**
 * 具体实现A
 * <p>
 * <a href="ConcreteImplementorA.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteImplementorA implements Implementor {

    /**
     * @see com.niufish.pattern.structure.bridge.Implementor#operationImp(java.lang.String)
     */
    public void operationImp(String inputText) {
        System.out.println("A:"+inputText);
    }

}
