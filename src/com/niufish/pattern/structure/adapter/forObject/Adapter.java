/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.adapter.forObject
 * 
 * �ļ����� Adapter.java
 * 
 */
package com.niufish.pattern.structure.adapter.forObject;

import com.niufish.pattern.structure.adapter.forClass.Adaptee;
import com.niufish.pattern.structure.adapter.forClass.Target;

/**
 * ��������ɫ��������������������
 * <p>
 * <a href="Adapter.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Adapter implements Target {
    
    /**
	 * ���еĴ��������
	 * @uml.property  name="_adaptee"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    private Adaptee _adaptee;
    
    /**
     * ��ʼ�����е��������
     * @param adaptee �������
     */
    public Adapter(Adaptee adaptee){
        _adaptee = adaptee;
    }
    
    /**
     * @see com.niufish.pattern.structure.adapter.forClass.Target#request()
     */
    public void request() {
        _adaptee.specificRequest();
    }

}
