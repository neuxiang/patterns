/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.chainOfResponsibility
 * 
 * 文件名称 ConcreteHandler2.java
 * 
 */
package com.niufish.pattern.behavioral.chainOfResponsibility;

/**
 * 具体处理者2
 * <p>
 * <a href="ConcreteHandler2.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteHandler2 extends Handler {

    /**
     * @see com.niufish.pattern.behavioral.chainOfResponsibility.Handler#handleRequest()
     */
    public void handleRequest() {
        if (getSuccessor()!=null){
            System.out.println("ConcreteHandler2的下家是:"+getSuccessor());
            getSuccessor().handleRequest();
        }else{
            System.out.println("ConcreteHandler2结束了");
        }
    }
    
    public String toString(){
        return "ConcreteHandler2";
    }
}
