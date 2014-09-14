/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.abstractFactory
 * 
 * �ļ����� ConcreteFactory1.java
 * 
 */
package com.example.pattern.build.abstractFactory;

/**
 * ����ɫֱ���ڿͻ��˵ĵ����´�����Ʒ��ʵ����
 * �����ɫ����ѡ����ʵĲ�Ʒ������߼���
 * ������߼�����Ӧ��ϵͳ����ҵ�߼�������صġ�
 * <p>
 * <a href="ConcreteFactory2.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteFactory2 implements AbstractFactory {

    /**
     * @see com.example.pattern.build.abstractFactory.AbstractFactory#createProductA()
     */
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    /**
     * @see com.example.pattern.build.abstractFactory.AbstractFactory#createProductB()
     */
    public AbstractProductB createProductB() {
        return new ProductB2();
    }

}