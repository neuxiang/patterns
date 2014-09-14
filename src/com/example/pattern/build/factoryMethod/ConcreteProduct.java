/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.factoryMethod
 * 
 * 文件名称 ConcreteProduct.java
 * 
 */
package com.example.pattern.build.factoryMethod;

/**
 * 具体产品
 * <p>
 * <a href="ConcreteProduct.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteProduct implements Product {
    
    public ConcreteProduct(){
        System.out.println("ConcreteProduct");
    }
}
