/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.adapter.forClass
 * 
 * 文件名称 Adapter.java
 * 
 */
package com.niufish.pattern.structure.adapter.forClass;

/**
 * 适配器角色，此模式的核心。
 * <p>
 * <a href="Adapter.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Adapter extends Adaptee implements Target {

    /**
     * 适配后的方法
     * @see com.niufish.pattern.structure.adapter.forClass.Target#request()
     */
    public void request() {
        this.specificRequest();
    }

}
