/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.visitor
 * 
 * 文件名称 ObjectStructure.java
 * 
 */
package com.niufish.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 结构对象角色
 * <p>
 * <a href="ObjectStructure.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ObjectStructure {
    
    /**
	 * 持有的元素的聚集
	 * @uml.property   name="_elements"
	 * @uml.associationEnd   multiplicity="(0 -1)" elementType="com.niufish.pattern.behavioral.visitor.Element"
	 */
    private List _elements;
    
    /**
     * 初始化元素的聚集
     */
    public ObjectStructure(){
        _elements = new ArrayList();
    }
    
    /**
     * 执行访问操作
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
     * 增加一个新的元素
     * @param el 新的元素
     */
    public void add(Element el){
        _elements.add(el);
    }

}
