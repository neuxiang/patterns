/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.composite.transparence
 * 
 * 文件名称 Component.java
 * 
 */
package com.niufish.pattern.structure.composite.transparence;


/**
 * 抽象构件角色，它给参加组合的类定义出公共的接口及其默认行为，
 * 这里包括管理所有的子对象的接口定义。<br />
 * <p>
 * <a href="Component.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Component {
    
    /**
     * 某种操作
     */
    void operation();

    /**
     * 增加一个子对象
     * @param component 子对象
     */
    void add(Component component);
    
    /**
     * 删除一个子对象
     * @param component 子对象
     */
    void remove(Component component);
}
