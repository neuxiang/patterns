/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.composite.safe
 * 
 * 文件名称 Composite.java
 * 
 */
package com.niufish.pattern.structure.composite.safe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 树枝角色，代表参加组合的有下级子对象的对象。<br />
 * 这里给出了所有管理子对象的方法
 * <p>
 * <a href="Composite.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Composite implements Component {
    
    /**
	 * 包含子对象的容器
	 * @uml.property   name="_componentList"
	 * @uml.associationEnd   multiplicity="(0 -1)" inverse="composite:com.niufish.pattern.structure.composite.safe.Component"
	 */
    private List _componentList = new ArrayList();
    
    /**
     * @see com.niufish.pattern.structure.composite.safe.Component#operation()
     */
    public void operation() {
        System.out.println("安全合成对象:operation");
        Iterator it = _componentList.iterator();
        while (it.hasNext()){
            ((Component)it.next()).operation();
        }
    }
    
    /**
     * @see com.niufish.pattern.structure.composite.safe.Component#getComposite()
     */
    public Composite getComposite() {
        return this;
    }

    /**
     * 增加一个子对象
     * @param component
     */
    public void add(Component component){
        _componentList.add(component);
    }
    
    /**
     * 删除一个子对象
     * @param component
     */
    public void remove(Component component){
        _componentList.remove(component);
    }

}
