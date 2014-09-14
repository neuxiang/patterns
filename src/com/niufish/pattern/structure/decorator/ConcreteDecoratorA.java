/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.decorator
 * 
 * 文件名称 ConcreteDecoratorA.java
 * 
 */
package com.niufish.pattern.structure.decorator;

/**
 * 在ConcreteComponent类之前扩展功能的类A
 * <p>
 * <a href="ConcreteDecoratorA.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteDecoratorA extends Decorator {

    /**
     * @param myC 被装入的Component对象
     */
    public ConcreteDecoratorA(Component myC) {
        super(myC);
    }

    /**
     * 添加自己的操作后运行其它
     * @see com.niufish.pattern.structure.decorator.Component#operation()
     */
    public void operation(){
        System.out.println("ConcreteDecoratorA");
        super.operation();
    }

}
