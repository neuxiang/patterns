/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.chainOfResponsibility
 * 
 * 文件名称 ConcreteHandler1.java
 * 
 */
package com.niufish.pattern.behavioral.chainOfResponsibility;

/**
 * 具体处理者1
 * <p>
 * <a href="ConcreteHandler1.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteHandler1 extends Handler {

    /**
     * @see com.niufish.pattern.behavioral.chainOfResponsibility.Handler#handleRequest()
     */
    public void handleRequest() {
        if (getSuccessor()!=null){
            System.out.println("ConcreteHandler1的下家是:"+getSuccessor());
            getSuccessor().handleRequest();
        }else{
            System.out.println("ConcreteHandler1结束了");
        }
    }
    
    public String toString(){
        return "ConcreteHandler1";
    }

}
