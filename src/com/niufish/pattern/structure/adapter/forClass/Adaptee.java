/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.adapter.forClass
 * 
 * 文件名称 Adaptee.java
 * 
 */
package com.niufish.pattern.structure.adapter.forClass;

/**
 * 待适配角色，现有需要适配的接口
 * <p>
 * <a href="Adaptee.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Adaptee {
    
    /**
     * 待适配的方法
     */
    public void specificRequest(){
        System.out.println("Adaptee work");
    }

}
