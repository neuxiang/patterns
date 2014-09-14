/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.visitor
 * 
 * �ļ����� ConcreteElementA.java
 * 
 */
package com.niufish.pattern.behavioral.visitor;

/**
 * ����Ԫ��A
 * <p>
 * <a href="ConcreteElementA.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteElementA implements Element {

    /**
     * @see com.niufish.pattern.behavioral.visitor.Element#accept(com.niufish.pattern.behavioral.visitor.Visitor)
     */
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    /**
     * ���еķ���
     * @return һ�ַ���
     */
    public String operationA(){
        return "operation from A";
    }

}
