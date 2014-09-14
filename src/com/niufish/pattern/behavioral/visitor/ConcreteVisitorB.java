/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.visitor
 * 
 * 文件名称 ConcreteVisitorB.java
 * 
 */
package com.niufish.pattern.behavioral.visitor;

/**
 * 具体访问者B角色
 * <p>
 * <a href="ConcreteVisitorB.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteVisitorB implements Visitor {

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
