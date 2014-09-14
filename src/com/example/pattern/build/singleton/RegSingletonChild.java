/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.singleton
 * 
 * 文件名称 RegSingletonChild.java
 * 
 */
package com.example.pattern.build.singleton;

/**
 * 可继承单例的子类
 * <p>
 * <a href="RegSingletonChild.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class RegSingletonChild extends RegSingleton {
    
    public RegSingletonChild(){
        System.out.println("RegSingletonChild initialized");
    }
    
    /**
     * 静态工厂方法，返回此类的唯一实例
     * @return 自己
     */
    static public RegSingletonChild getInstance(){
        return (RegSingletonChild)RegSingleton.getInstance("com.example.pattern.build.singleton.RegSingletonChild");
    }
    
}
