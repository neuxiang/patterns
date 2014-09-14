/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.decorator
 * 
 * 文件名称 ConcreteComponent.java
 * 
 */
package com.niufish.pattern.structure.decorator;

/**
 * 实现具体功能的主类
 * <p>
 * <a href="ConcreteComponent.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteComponent implements Component {

    /**
     * @see com.niufish.pattern.structure.decorator.Component#operation()
     */
    public void operation() {
        System.out.println("ConcreteComponent");
    }

}
