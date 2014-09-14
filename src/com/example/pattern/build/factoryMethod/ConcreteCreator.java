/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.factoryMethod
 * 
 * 文件名称 ConcreteCreator.java
 * 
 */
package com.example.pattern.build.factoryMethod;

/**
 * 具体工厂，此类中包含于应用密切相关的逻辑，并且受到应用程序的调用以创建产品对象。
 * <p>
 * <a href="ConcreteCreator.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteCreator implements Creator {

    /**
     * @see com.example.pattern.build.factoryMethod.Creator#FactoryMethod()
     */
    public Product FactoryMethod() {
        return new ConcreteProduct();
    }

}
