/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.bridge
 * 
 * �ļ����� ConcreteImplementorB.java
 * 
 */
package com.niufish.pattern.structure.bridge;

/**
 * ����ʵ��B
 * <p>
 * <a href="ConcreteImplementorB.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteImplementorB implements Implementor {

    /**
     * @see com.niufish.pattern.structure.bridge.Implementor#operationImp(java.lang.String)
     */
    public void operationImp(String inputText) {
        System.err.println("B:"+inputText);
    }

}
