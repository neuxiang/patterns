/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.visitor
 * 
 * 文件名称 Visitor.java
 * 
 */
package com.niufish.pattern.behavioral.visitor;

/**
 * 抽象访问者角色，声明一个或多个访问操作
 * <p>
 * <a href="Visitor.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Visitor {
    
    /**
     * 对于ConcreteElementA的访问操作
     * @param cea 具体元素
     */
    void visit(ConcreteElementA cea);

    /**
     * 对于ConcreteElementB的访问操作
     * @param ceb 具体元素
     */
    void visit(ConcreteElementB ceb);

}
