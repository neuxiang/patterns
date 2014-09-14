/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.composite.safe
 * 
 * 文件名称 Leaf.java
 * 
 */
package com.niufish.pattern.structure.composite.safe;

/**
 * 树叶类，此类没有下级对象，定义出参加组合的真正“某种操作”
 * <p>
 * <a href="Leaf.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Leaf implements Component {

    /**
     * @see com.niufish.pattern.structure.composite.safe.Component#operation()
     */
    public void operation() {
        System.out.println("安全树叶对象:operation");
    }

    /**
     * @see com.niufish.pattern.structure.composite.safe.Component#getComposite()
     */
    public Composite getComposite() {
        return null;
    }

}
