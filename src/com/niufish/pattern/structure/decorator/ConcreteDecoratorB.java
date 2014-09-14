/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.decorator
 * 
 * 文件名称 ConcreteDecoratorB.java
 * 
 */
package com.niufish.pattern.structure.decorator;

/**
 * 在ConcreteComponent类之后扩展功能的类B
 * <p>
 * <a href="ConcreteDecoratorB.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteDecoratorB extends Decorator {

    /**
     * @param myC 被装入的Component对象
     */
    public ConcreteDecoratorB(Component myC) {
        super(myC);
    }

    /**
     * 先运行其它操作，后添加自己的操作
     * @see com.niufish.pattern.structure.decorator.Component#operation()
     */
    public void operation(){
        super.operation();
        System.out.println("ConcreteDecoratorB");
    }

}
