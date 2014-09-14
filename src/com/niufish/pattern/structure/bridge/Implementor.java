/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.bridge
 * 
 * 文件名称 Implementor.java
 * 
 */
package com.niufish.pattern.structure.bridge;

/**
 * 给出实现的接口，主要负责底层操作。
 * <p>
 * <a href="Implementor.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Implementor {
    
    /**
     * 操作实现方法
     * @param inputText
     */
    void operationImp(String inputText);

}
