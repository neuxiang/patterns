/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.observer
 * 
 * 文件名称 ConcreteSubject.java
 * 
 */
package com.niufish.pattern.behavioral.observer;

import java.util.Observable;

/**
 * 具体的被观察者
 * <p>
 * <a href="ConcreteSubject.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteSubject extends Observable {
    
    /**
	 * 持有的数据
	 * @uml.property  name="_data"
	 */
    private String _data = "";
    
    /**
     * @return 持有的数据
     */
    public String getData() {
        return _data;
    }
    
    /**
     * 改值
     * @param data 新的值
     */
    public void setData(String data) {
        if (!this._data.equals(data)){
            this._data = data;
            setChanged();
        }
        notifyObservers();
    }
}
