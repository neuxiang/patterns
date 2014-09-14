/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.composite.transparence
 * 
 * 文件名称 Composite.java
 * 
 */
package com.niufish.pattern.structure.composite.transparence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 树枝角色，代表参加组合的有下级子对象的对象。<br />
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
	 * @uml.associationEnd   multiplicity="(0 -1)" elementType="com.niufish.pattern.structure.composite.transparence.Component"
	 */
    private List _componentList = new ArrayList();
    
    /**
     * @see com.niufish.pattern.structure.composite.transparence.Component#operation()
     */
    public void operation() {
        System.out.println("透明合成对象:operation");
        Iterator it = _componentList.iterator();
        while (it.hasNext()){
            ((Component)it.next()).operation();
        }        
    }

    /**
     * @see com.niufish.pattern.structure.composite.transparence.Component#add(com.niufish.pattern.structure.composite.transparence.Component)
     */
    public void add(Component component) {
        _componentList.add(component);
    }

    /**
     * @see com.niufish.pattern.structure.composite.transparence.Component#remove(com.niufish.pattern.structure.composite.transparence.Component)
     */
    public void remove(Component component) {
        _componentList.remove(component);
    }

}
