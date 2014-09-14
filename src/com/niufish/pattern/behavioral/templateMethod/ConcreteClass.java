/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.templateMethod
 * 
 * 文件名称 ConcreteClass.java
 * 
 */
package com.niufish.pattern.behavioral.templateMethod;

/**
 * 具体模版角色
 * <p>
 * <a href="ConcreteClass.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteClass extends AbstractClass {

    /**
     * @see com.niufish.pattern.behavioral.templateMethod.AbstractClass#primitiveOperation1()
     */
    protected void primitiveOperation1() {
        System.out.println("primitiveOperation1");
    }

    /**
     * @see com.niufish.pattern.behavioral.templateMethod.AbstractClass#primitiveOperation2()
     */
    protected void primitiveOperation2() {
        System.out.println("primitiveOperation2");
    }

}
