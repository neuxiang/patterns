/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.bridge
 * 
 * 文件名称 Client.java
 * 
 */
package com.niufish.pattern.structure.bridge;

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
        Implementor imp = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imp);
        abs.operation();
        Implementor imp2 = new ConcreteImplementorB();
        Abstraction abs2 = new RefinedAbstraction(imp2);
        abs2.operation();
        
    }
}
