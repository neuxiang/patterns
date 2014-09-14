/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.prototype
 * 
 * 文件名称 ConcretePrototype1.java
 * 
 */
package com.example.pattern.build.prototype;

/**
 * 具体的原始模型类2
 * <p>
 * <a href="ConcretePrototype2.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcretePrototype2 implements Cloneable {
    
    /**
	 * @uml.property  name="_name"
	 */
    private String _name;
    
    public String getName() {
        return _name;
    }
    
    public void setName(String type) {
        this._name = type;
    }
    
    /**
     * 克隆方法
     * @see java.lang.Object#clone()
     */
    public Object clone(){
        ConcretePrototype2 temp = new ConcretePrototype2();
        temp.setName(_name);
        return (Object)temp;
    }
}
