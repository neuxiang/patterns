/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.visitor
 * 
 * �ļ����� ConcreteVisitorA.java
 * 
 */
package com.niufish.pattern.behavioral.visitor;

/**
 * ���������A��ɫ
 * <p>
 * <a href="ConcreteVisitorA.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteVisitorA implements Visitor {

    /**
     * @see com.niufish.pattern.behavioral.visitor.Visitor#visit(com.niufish.pattern.behavioral.visitor.ConcreteElementA)
     */
    public void visit(ConcreteElementA cea) {
        System.out.println(cea.operationA());
    }

    /**
     * @see com.niufish.pattern.behavioral.visitor.Visitor#visit(com.niufish.pattern.behavioral.visitor.ConcreteElementB)
     */
    public void visit(ConcreteElementB ceb) {
        System.out.println(ceb.operationB());
    }

}