/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.mediator
 * 
 * �ļ����� ConcreteMediator.java
 * 
 */
package com.niufish.pattern.behavioral.mediator;

/**
 * ����ĵ�ͣ��
 * <p>
 * <a href="ConcreteMediator.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteMediator implements Mediator {
    
    /**
	 * ���е�ͬ��1
	 * @uml.property  name="_col1"
	 * @uml.associationEnd  
	 */
    private ConcreteColleague1 _col1;
    
    /**
	 * ���е�ͬ��2
	 * @uml.property  name="_col2"
	 * @uml.associationEnd  
	 */
    private ConcreteColleague2 _col2;
    
    /**
     * ��ʼ�����еĶ���
     * @param c1 ͬ��1
     * @param c2 ͬ��2
     */
    public void introColleagues(ConcreteColleague1 c1,ConcreteColleague2 c2){
        this._col1 = c1;
        this._col2 = c2;
    }
    
    /**
     * @see com.niufish.pattern.behavioral.mediator.Mediator#doSomething()
     */
    public void doSomething() {
        _col1.action();
        _col2.action();
    }
    
    public ConcreteColleague1 getConcreteColleague1() {
        return _col1;
    }
    public void setConcreteColleague1(ConcreteColleague1 _col1) {
        this._col1 = _col1;
    }
    public ConcreteColleague2 getConcreteColleague2() {
        return _col2;
    }
    public void setConcreteColleague2(ConcreteColleague2 _col2) {
        this._col2 = _col2;
    }
}
