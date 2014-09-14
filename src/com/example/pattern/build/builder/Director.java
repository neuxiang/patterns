/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.builder
 * 
 * 文件名称 Director.java
 * 
 */
package com.example.pattern.build.builder;

/**
 * 导演，负责有规则的构建对象 <br />
 * 与Client类合并时需要把建造的细节放到ConcreteBuilder中去
 * <p>
 * <a href="Director.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Director {
    
    /**
	 * @uml.property  name="_builder"
	 * @uml.associationEnd  
	 */
    private Builder _builder;
    
    /**
     * 产品构造方法，负责调用各个零件建造方法
     */
    public void construct(){
        _builder = new ConcreteBuilder();
        _builder.buildPart1();
        _builder.buildPart2();
        System.out.println(_builder.getResult().toString());
    }
    

}
