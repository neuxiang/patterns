/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.visitor
 * 
 * 文件名称 Element.java
 * 
 */
package com.niufish.pattern.behavioral.visitor;

/**
 * 抽象元素角色
 * <p>
 * <a href="Element.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Element {
    
    /**
     * 接受访问者的方法
     * @param visitor 访问者
     */
    void accept(Visitor visitor);

}
