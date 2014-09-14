/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.flyweight
 * 
 * 文件名称 ConcreteFlyweight.java
 * 
 */
package com.niufish.pattern.structure.flyweight;

/**
 * 具体享元角色
 * <p>
 * <a href="ConcreteFlyweight.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteFlyweight extends Flyweight {
    
    /**
	 * 类的内蕴
	 * @uml.property  name="_intrinsicState"
	 */
    private String _intrinsicState = "本来的东西";
    
    /**
     * 构造的时候来个提示
     */
    public ConcreteFlyweight(){
        System.out.println("ConcreteFlyweight init");
    }
    /**
     * @see com.niufish.pattern.structure.flyweight.Flyweight#operation(java.lang.String)
     */
    public void operation(String extrinsicState) {
        System.out.println("ConcreteFlyweight:内蕴["+_intrinsicState+"] 外蕴["+extrinsicState+"]");
    }

}
