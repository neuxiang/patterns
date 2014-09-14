/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.mediator
 * 
 * 文件名称 Client.java
 * 
 */
package com.niufish.pattern.behavioral.mediator;

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
        ConcreteMediator med = new ConcreteMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(med);
        ConcreteColleague2 c2 = new ConcreteColleague2(med);
        med.introColleagues(c1,c2);
        med.doSomething();
        c1.setHelloWords("good job!");
        c1.change();
        System.out.println("===================");
    }


}
