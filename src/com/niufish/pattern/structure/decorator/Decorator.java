/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.decorator
 * 
 * 文件名称 Decorator.java
 * 
 */
package com.niufish.pattern.structure.decorator;

/**
 * 装饰者
 * <p>
 * <a href="Decorator.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public abstract class Decorator implements Component {
    
    /**
	 * 一个存放的容器
	 */
    private Component myComp;
    
    /**
     * @param myC 被装入的Component对象
     */
    public Decorator(Component myC){
        myComp = myC;
    }
    
    /**
     * @see com.niufish.pattern.structure.decorator.Component#operation()
     */
    public void operation() {
        if (myComp!=null) myComp.operation();
    }

}
