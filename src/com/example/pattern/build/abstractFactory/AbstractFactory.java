/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.abstractFactory
 * 
 * �ļ����� AbstractFactory.java
 * 
 */
package com.example.pattern.build.abstractFactory;

/**
 * �����ǳ��󹤳�����ģʽ�ĺ���
 * 
 * <p>
 * <a href="AbstractFactory.java.html"><i>View Source</i></a>
 * </p>
 * 
 * @author	Kingfish
 * @version	1.0
 */
public interface AbstractFactory {
    
    /**
     * ������ƷA
     * @return ��ƷA
     */
    AbstractProductA createProductA();
    
    /**
     * ������ƷB
     * @return ��ƷB
     */
    AbstractProductB createProductB();

}
