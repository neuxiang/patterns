/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.iterator
 * 
 * 文件名称 Aggregate.java
 * 
 */
package com.niufish.pattern.iterator;

/**
 * 聚集角色
 * <p>
 * <a href="Aggregate.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Aggregate {
    
    /**
     * 工厂方法，创建迭代子的接口
     * @return 迭代子
     */
    Iterator createIterator();
    
}
