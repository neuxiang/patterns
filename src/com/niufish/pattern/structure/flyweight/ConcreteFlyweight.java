/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.flyweight
 * 
 * �ļ����� ConcreteFlyweight.java
 * 
 */
package com.niufish.pattern.structure.flyweight;

/**
 * ������Ԫ��ɫ
 * <p>
 * <a href="ConcreteFlyweight.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteFlyweight extends Flyweight {
    
    /**
	 * �������
	 * @uml.property  name="_intrinsicState"
	 */
    private String _intrinsicState = "�����Ķ���";
    
    /**
     * �����ʱ��������ʾ
     */
    public ConcreteFlyweight(){
        System.out.println("ConcreteFlyweight init");
    }
    /**
     * @see com.niufish.pattern.structure.flyweight.Flyweight#operation(java.lang.String)
     */
    public void operation(String extrinsicState) {
        System.out.println("ConcreteFlyweight:����["+_intrinsicState+"] ����["+extrinsicState+"]");
    }

}
