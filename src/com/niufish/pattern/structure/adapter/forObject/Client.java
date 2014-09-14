/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.adapter.forObject
 * 
 * 文件名称 Client.java
 * 
 */
package com.niufish.pattern.structure.adapter.forObject;

import com.niufish.pattern.structure.adapter.forClass.Adaptee;
import com.niufish.pattern.structure.adapter.forClass.Target;

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
        Target t = new Adapter(new Adaptee());
        t.request();
    }
}
