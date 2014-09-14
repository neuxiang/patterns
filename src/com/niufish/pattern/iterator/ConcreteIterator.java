/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.iterator
 * 
 * 文件名称 ConcreteIterator.java
 * 
 */
package com.niufish.pattern.iterator;

/**
 * 具体迭代子角色
 * <p>
 * <a href="ConcreteIterator.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteIterator implements Iterator {
    
    /**
	 * 持有的具体聚集对象
	 * @uml.property  name="_cagg"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
    private ConcreteAggregate _cagg;
    
    /**
	 * 聚集索引
	 * @uml.property  name="_index"
	 */
    private int _index = 0;
    
    /**
     * 初始化具体聚集对象
     * @param cagg 具体聚集对象
     */
    public ConcreteIterator(ConcreteAggregate cagg){
        _cagg = cagg;
    }

    /**
     * @see com.niufish.pattern.iterator.Iterator#first()
     */
    public void first() {
        _index = 0;
    }

    /**
     * @see com.niufish.pattern.iterator.Iterator#next()
     */
    public void next() {
        if (_index < _cagg.size())
            _index++;
    }

    /**
     * @see com.niufish.pattern.iterator.Iterator#isDone()
     */
    public boolean isDone() {
        return (_index >= _cagg.size());
    }

    /**
     * @see com.niufish.pattern.iterator.Iterator#currentItem()
     */
    public Object currentItem() {
        return _cagg.getElement(_index);
    }

}
