/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.mediator
 * 
 * 文件名称 ConcreteColleague1.java
 * 
 */
package com.niufish.pattern.behavioral.mediator;

/**
 * 具体的同事类1
 * <p>
 * <a href="ConcreteColleague1.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteColleague1 extends Colleague {
    
    /**
	 * @uml.property  name="_helloWords"
	 */
    private String _helloWords = "happy new year!";

    /**
     * @param med 调停者
     */
    public ConcreteColleague1(Mediator med) {
        super(med);
    }

    /**
     * @see com.niufish.pattern.behavioral.mediator.Colleague#action()
     */
    public void action() {
        System.out.println(_helloWords+" from Colleague1");
    }

    public void setHelloWords(String helloWords) {
        this._helloWords = helloWords;
    }
}
