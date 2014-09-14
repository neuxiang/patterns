/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.bridge
 * 
 * 文件名称 RefinedAbstraction.java
 * 
 */
package com.niufish.pattern.structure.bridge;

/**
 * 扩展抽象类，改变和修正父类对象的定义
 * <p>
 * <a href="RefinedAbstraction.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class RefinedAbstraction extends Abstraction {

    /**
     * @param imp
     */
    public RefinedAbstraction(Implementor imp) {
        super(imp);
    }

    /**
     * @see com.niufish.pattern.structure.bridge.Abstraction#operation()
     */
    public void operation() {
        super.print("RefinedAbstraction");
    }

}
