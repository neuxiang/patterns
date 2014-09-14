/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.composite.transparence
 * 
 * 文件名称 Leaf.java
 * 
 */
package com.niufish.pattern.structure.composite.transparence;

/**
 * 树叶对象，此类没有下级对象，定义出参加组合的真正“某种操作”
 * <p>
 * <a href="Leaf.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Leaf implements Component {

    /**
     * @see com.niufish.pattern.structure.composite.transparence.Component#operation()
     */
    public void operation() {
        System.out.println("透明树叶对象:operation");
    }

    /**
     * @see com.niufish.pattern.structure.composite.transparence.Component#add(com.niufish.pattern.structure.composite.transparence.Component)
     */
    public void add(Component component) {
    }

    /**
     * @see com.niufish.pattern.structure.composite.transparence.Component#remove(com.niufish.pattern.structure.composite.transparence.Component)
     */
    public void remove(Component component) {
    }

}
