/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.iterator
 * 
 * 文件名称 Iterator.java
 * 
 */
package com.niufish.pattern.iterator;

/**
 * 抽象迭代子角色，定义出遍历元素所需要的接口
 * <p>
 * <a href="Iterator.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Iterator {
    
    /**
     * 移动到第一个元素
     */
    void first();
    
    /**
     * 移动到下一个元素
     */
    void next();
    
    /**
     * @return 是否是最后一个元素
     */
    boolean isDone();
    
    /**
     * @return 当前元素 
     */
    Object currentItem();
    
    

}
