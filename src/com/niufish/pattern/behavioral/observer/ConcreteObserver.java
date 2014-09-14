/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.observer
 * 
 * 文件名称 ConcreteObserver.java
 * 
 */
package com.niufish.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者
 * <p>
 * <a href="ConcreteObserver.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteObserver implements Observer {
    
    /**
     * 和被监视的对象挂钩
     * @param cs
     */
    public ConcreteObserver(ConcreteSubject cs){
        cs.addObserver(this);
    }
    
    /**
     * 更新自己
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    public void update(Observable o, Object arg) {
        System.out.println("Data has been changed to:"+((ConcreteSubject)o).getData());
    }

}
