/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.proxy
 * 
 * 文件名称 Client.java
 * 
 */
package com.niufish.pattern.structure.proxy;

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
        Subject shaobing = new Proxy();
        System.out.println(shaobing.request());
    }
}
