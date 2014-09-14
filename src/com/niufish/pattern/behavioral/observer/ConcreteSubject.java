/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.observer
 * 
 * �ļ����� ConcreteSubject.java
 * 
 */
package com.niufish.pattern.behavioral.observer;

import java.util.Observable;

/**
 * ����ı��۲���
 * <p>
 * <a href="ConcreteSubject.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteSubject extends Observable {
    
    /**
	 * ���е�����
	 * @uml.property  name="_data"
	 */
    private String _data = "";
    
    /**
     * @return ���е�����
     */
    public String getData() {
        return _data;
    }
    
    /**
     * ��ֵ
     * @param data �µ�ֵ
     */
    public void setData(String data) {
        if (!this._data.equals(data)){
            this._data = data;
            setChanged();
        }
        notifyObservers();
    }
}
