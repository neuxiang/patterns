/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.iterator
 * 
 * 文件名称 ConcreteAggregate.java
 * 
 */
package com.niufish.pattern.iterator;

/**
 * 具体聚集角色
 * <p>
 * <a href="ConcreteAggregate.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteAggregate implements Aggregate {
    
    /**
	 * 持有的数组对象
	 * @uml.property  name="_objs" multiplicity="(0 -1)" dimension="1"
	 */
    private Object[] _objs = {"kingfish","niuniu","99"};
    
    /**
     * @see com.niufish.pattern.iterator.Aggregate#createIterator()
     */
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
    
    /**
     * 提供聚集元素
     * @param idx 位置
     * @return 在位置上的对象
     */
    public Object getElement(int idx){
        if (idx < _objs.length)
            return _objs[idx];
        else
            return null;
    }
    
    /**
     * @return 聚集的大小
     */
    public int size(){
        return _objs.length;
    }

}
