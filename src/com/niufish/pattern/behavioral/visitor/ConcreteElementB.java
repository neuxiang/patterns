/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.visitor
 * 
 * 文件名称 ConcreteElementB.java
 * 
 */
package com.niufish.pattern.behavioral.visitor;

/**
 * 具体元素B
 * <p>
 * <a href="ConcreteElementB.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteElementB implements Element {

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
    public String operationB(){
        return "operation from B";
    }

}
