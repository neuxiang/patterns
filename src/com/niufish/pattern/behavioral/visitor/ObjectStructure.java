/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.visitor
 * 
 * �ļ����� ObjectStructure.java
 * 
 */
package com.niufish.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * �ṹ�����ɫ
 * <p>
 * <a href="ObjectStructure.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ObjectStructure {
    
    /**
	 * ���е�Ԫ�صľۼ�
	 * @uml.property   name="_elements"
	 * @uml.associationEnd   multiplicity="(0 -1)" elementType="com.niufish.pattern.behavioral.visitor.Element"
	 */
    private List _elements;
    
    /**
     * ��ʼ��Ԫ�صľۼ�
     */
    public ObjectStructure(){
        _elements = new ArrayList();
    }
    
    /**
     * ִ�з��ʲ���
     * @param visitor
     */
    public void action(Visitor visitor){
        Iterator it = _elements.iterator();
        while (it.hasNext()){
            Element e = (Element)it.next();
            e.accept(visitor);
        }
    }
    
    /**
     * ����һ���µ�Ԫ��
     * @param el �µ�Ԫ��
     */
    public void add(Element el){
        _elements.add(el);
    }

}
