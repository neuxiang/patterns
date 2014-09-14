/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.mediator
 * 
 * 文件名称 Colleague.java
 * 
 */
package com.niufish.pattern.behavioral.mediator;

/**
 * 抽象同事角色，此对象只知道调停者而不知道其余同事对象
 * <p>
 * <a href="Colleague.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public abstract class Colleague {
    
    /**
	 * 持有的调停者对象
	 * @uml.property  name="_mediator"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    private Mediator _mediator;
    
    /**
     * 初始化持有的调停者对象
     * @param med
     */
    public Colleague(Mediator med){
        _mediator = med;
    }
    
    /**
     * 得到调停者
     * @return 调停者
     */
    public Mediator getMediator(){
        return _mediator;
    }
    
    /**
     * 动作，由子类实现
     */
    public abstract void action();
    
    /**
     * 示意的方法<br />
     * 改变对象的内部状态
     */
    public void change(){
        if (_mediator!=null)
            _mediator.doSomething();
    }

}
