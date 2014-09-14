/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.factoryMethod
 * 
 * 文件名称 Creator.java
 * 
 */
package com.example.pattern.build.factoryMethod;

/**
 * 抽象工厂，任何在模式中创建的工厂类必须实现这个接口
 * <p>
 * <a href="Creator.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Creator {
    
    /**
     * 工厂方法
     * @return 抽象的产品
     */
    Product FactoryMethod();

}
