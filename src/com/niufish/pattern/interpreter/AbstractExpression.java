/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.interpreter
 * 
 * 文件名称 AbstractExpression.java
 * 
 */
package com.niufish.pattern.interpreter;

/**
 * 抽象表达式角色
 * <p>
 * <a href="AbstractExpression.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface AbstractExpression {
    
    /**
     * 解释操作
     * @param c
     */
    void interpret(Context c);

}
