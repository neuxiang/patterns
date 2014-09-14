/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.mediator
 * 
 * 文件名称 ConcreteColleague2.java
 * 
 */
package com.niufish.pattern.behavioral.mediator;

/**
 * 具体的同事类2
 * <p>
 * <a href="ConcreteColleague2.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteColleague2 extends Colleague {

    /**
     * @param med 调停者
     */
    public ConcreteColleague2(Mediator med) {
        super(med);
    }

    /**
     * @see com.niufish.pattern.behavioral.mediator.Colleague#action()
     */
    public void action() {
        System.out.println("hello from Colleague2");
    }

}
