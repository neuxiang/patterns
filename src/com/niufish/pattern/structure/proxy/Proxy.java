/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.proxy
 * 
 * 文件名称 Proxy.java
 * 
 */
package com.niufish.pattern.structure.proxy;

/**
 * 扒层皮的代理
 * <p>
 * <a href="Proxy.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Proxy implements Subject {
    
    /**
	 * 持有的真正干活的类
	 */
    private RealSubject _realSubject;
    
    /**
     * @see com.niufish.pattern.structure.proxy.Subject#request()
     */
    public int request() {
        _realSubject = new RealSubject();
        int costOfProxy = 10;
        int cost = _realSubject.request();
        return cost+costOfProxy;
    }

}
