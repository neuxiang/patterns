/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.visitor
 * 
 * 文件名称 ConcreteElementA.java
 * 
 */
package com.niufish.pattern.behavioral.visitor;

/**
 * 具体元素A
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
     * 特有的方法
     * @return 一字符串
     */
    public String operationA(){
        return "operation from A";
    }

}
