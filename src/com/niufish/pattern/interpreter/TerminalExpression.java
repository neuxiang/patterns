/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.interpreter
 * 
 * 文件名称 TerminalExpression.java
 * 
 */
package com.niufish.pattern.interpreter;

/**
 * 终结表达式 <br />
 * 此处为一般语句
 * <p>
 * <a href="TerminalExpression.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class TerminalExpression implements AbstractExpression {
    
    /**
	 * 持有的语句
	 * @uml.property  name="_statement"
	 */
    private String _statement;
    
    /**
     * 初始化持有对象
     * @param stat 语句的字符串
     */
    public TerminalExpression(String stat){
        _statement = stat;
    }

    /**
     * @see com.niufish.pattern.interpreter.AbstractExpression#interpret(com.niufish.pattern.interpreter.Context)
     */
    public void interpret(Context c) {
        System.out.println(_statement);
    }

}
