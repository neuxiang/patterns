/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.interpreter
 * 
 * 文件名称 Client.java
 * 
 */
package com.niufish.pattern.interpreter;

/**
 * 测试类
 * <p>
 * <a href="Client.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Context c = new Context();
        AbstractExpression ae = new NonterminalExpression(new TerminalExpression("hello my friend!"),2);
        ae.interpret(c);
    }
}
