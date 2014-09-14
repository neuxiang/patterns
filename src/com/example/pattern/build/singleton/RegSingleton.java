/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.singleton
 * 
 * 文件名称 RegSingleton.java
 * 
 */
package com.example.pattern.build.singleton;

import java.util.HashMap;

/**
 * 可继承单例，但是子类不能够使线程安全
 * <p>
 * <a href="RegSingleton.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class RegSingleton {
    
    /**
     * 所有实例化了的类
     */
    static private HashMap _registry = new HashMap();
    
    /**
     * 保护的构造子
     */
    protected RegSingleton(){
        System.out.println("RegSingleton initialized");
    }
    
    /**
     * 静态工厂方法，返回此类的唯一实例
     * @param name 要的那个类名字
     * @return 要的那个类
     */
    static public RegSingleton getInstance(String name){
        if (name==null){
            return new RegSingleton();
        }
        if (_registry.get(name)==null){
            try{
                _registry.put(name,Class.forName(name).newInstance());
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return (RegSingleton)_registry.get(name);
    }
    
}
