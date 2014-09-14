/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.composite.safe
 * 
 * 文件名称 Component.java
 * 
 */
package com.niufish.pattern.structure.composite.safe;

/**
 * 抽象构件角色，它给参加组合的对象定义出公共的接口及其默认行为， 可以用来管理所有的子对象。<br /> 在安全式的合成模式里，这里不定义出管理子对象的方法，这一定义又树枝对象给出 <p> <a href="Component.java.html"><i>View Source</i></a> </p>
 * @author   Kingfish
 * @version  1.0
 */
public interface Component {
    
    /**
     * 某种操作
     */
    void operation();

    /**
	 * 返回自己的实例
	 * @return  自己的实例
	 */
    Composite getComposite();
    
}
