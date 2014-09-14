/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.singleton
 * 
 * 文件名称 Singleton.java
 * 
 */
package com.example.pattern.build.singleton;

/**
 * 线程安全的单例
 * <p>
 * <a href="Singleton.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Singleton {
    
    /**
     * 持有的自己
     */
    private static Singleton _uniqueInstance = null;
    
    /**
     * 私有构造子，保证外界无法直接实例化
     */
    private Singleton(){
        System.out.println("Singleton initialized");
    }
    
    /**
     * 静态工厂方法，返回此类的唯一实例
     * @return 自己
     */
    synchronized public static Singleton getInstance(){
        if (_uniqueInstance==null){
            _uniqueInstance = new Singleton();
        }
        return _uniqueInstance;
    }
}
