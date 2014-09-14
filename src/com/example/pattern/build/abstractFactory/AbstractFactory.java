/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.abstractFactory
 * 
 * 文件名称 AbstractFactory.java
 * 
 */
package com.example.pattern.build.abstractFactory;

/**
 * 此类是抽象工厂方法模式的核心
 * 
 * <p>
 * <a href="AbstractFactory.java.html"><i>View Source</i></a>
 * </p>
 * 
 * @author	Kingfish
 * @version	1.0
 */
public interface AbstractFactory {
    
    /**
     * 产生产品A
     * @return 产品A
     */
    AbstractProductA createProductA();
    
    /**
     * 产生产品B
     * @return 产品B
     */
    AbstractProductB createProductB();

}
