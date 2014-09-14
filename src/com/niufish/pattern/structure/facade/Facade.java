/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.facade
 * 
 * 文件名称 Facade.java
 * 
 */
package com.niufish.pattern.structure.facade;

/**
 * 门面角色
 * <p>
 * <a href="Facade.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Facade {
    
    private SubSystem1 s1 = new SubSystem1();
    
    private SubSystem2 s2 = new SubSystem2();
    
    /**
     * 把子系统中的动作打包
     */
    public void OperationWrapper(){
        s1.operation();
        s2.operation();
    }
}
