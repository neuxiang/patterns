/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.builder
 * 
 * 文件名称 Builder.java
 * 
 */
package com.example.pattern.build.builder;

/**
 * 抽象建造者，规范产品对象的各个组成成分的建造。一般而言，此接口独立于应用程序的商业逻辑。 <p> <a href="Builder.java.html"><i>View Source</i></a> </p>
 * @author   Kingfish
 * @version  1.0
 */
public interface Builder {
    
    void buildPart1();
    
    void buildPart2();
    
    /**
	 * @uml.property  name="result"
	 * @uml.associationEnd  
	 */
    Product getResult();
    
}
