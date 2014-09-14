/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.flyweight
 * 
 * 文件名称 Flyweight.java
 * 
 */
package com.niufish.pattern.structure.flyweight;

/**
 * 抽象享元角色，规定具体享元角色的接口。
 * <p>
 * <a href="Flyweight.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public abstract class Flyweight {
    
    /**
     * 测试方法
     * @param extrinsicState 外蕴状态
     */
    abstract public void operation(String extrinsicState);
}
