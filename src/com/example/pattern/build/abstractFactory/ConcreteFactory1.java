/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.abstractFactory
 * 
 * 文件名称 ConcreteFactory1.java
 * 
 */
package com.example.pattern.build.abstractFactory;

/**
 * 本角色直接在客户端的调用下创建产品的实例。
 * 这个角色含有选择合适的产品对象的逻辑，
 * 而这个逻辑适于应用系统的商业逻辑紧密相关的。
 * <p>
 * <a href="ConcreteFactory1.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteFactory1 implements AbstractFactory {

    /**
     * @see com.example.pattern.build.abstractFactory.AbstractFactory#createProductA()
     */
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    /**
     * @see com.example.pattern.build.abstractFactory.AbstractFactory#createProductB()
     */
    public AbstractProductB createProductB() {
        return new ProductB1();
    }

}
