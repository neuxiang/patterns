/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.singleton
 * 
 * 文件名称 Client.java
 * 
 */
package com.example.pattern.build.singleton;

/**
 * 测试类
 * <p>
 * <a href="Client.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        line();
        RegSingleton s2 = RegSingleton.getInstance(null);
        line();
        RegSingletonChild s3 = RegSingletonChild.getInstance();
        line();
        RegSingletonChild s4 = RegSingletonChild.getInstance();
        line();
    }

    /**
     * 画条线
     */
    private static void line() {
        System.out.println("-------------------");
    }
}
