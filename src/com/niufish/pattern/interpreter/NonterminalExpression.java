/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.interpreter
 * 
 * 文件名称 NonterminalExpression.java
 * 
 */
package com.niufish.pattern.interpreter;

/**
 * 非终结表达式角色<br />
 * 此处为循环语句
 * <p>
 * <a href="NonterminalExpression.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class NonterminalExpression implements AbstractExpression {
    
    /**
	 * 持有的表达式
	 * @uml.property  name="_expression"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    private AbstractExpression _expression;
    
    /**
	 * 循环的次数
	 * @uml.property  name="_times"
	 */
    private int _times = 0;
    
    /**
     * 初始化持有对象，并明确循环次数
     * @param exp 表达式对象
     * @param times 循环的次数
     */
    public NonterminalExpression(AbstractExpression exp,int times){
        _expression = exp;
        _times = times;
    }
    
    /**
     * @see com.niufish.pattern.interpreter.AbstractExpression#interpret(com.niufish.pattern.interpreter.Context)
     */
    public void interpret(Context c) {
        for (int i=0;i<_times;i++){
            _expression.interpret(c);
        }
    }

}
