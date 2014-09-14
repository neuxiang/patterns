/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.proxy
 * 
 * 文件名称 RealSubject.java
 * 
 */
package com.niufish.pattern.structure.proxy;

/**
 * 真正干活的类
 * <p>
 * <a href="RealSubject.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class RealSubject implements Subject {
    
    /**
     * 做这
     */
    private void doThis(){
        System.out.print("烧饼的价格：");
    }

    /**
     * 做那，反正干了不少事情
     * @return 成本
     */
    private int doThat(){
        return 2;
    }

    /**
     * @see com.niufish.pattern.structure.proxy.Subject#request()
     */
    public int request() {
        doThis();
        return doThat();
    }

}
