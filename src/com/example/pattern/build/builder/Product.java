/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.builder
 * 
 * 文件名称 Product.java
 * 
 */
package com.example.pattern.build.builder;

/**
 * 产品的抽象 <p> <a href="Product.java.html"><i>View Source</i></a> </p>
 * @author   Kingfish
 * @version  1.0
 */
public interface Product {
    
    /**
	 * @uml.property  name="part1"
	 */
    public String getPart1();

    /**
	 * @param part1
	 * @uml.property  name="part1"
	 */
    public void setPart1(String part1);

    /**
	 * @uml.property  name="part2"
	 */
    public String getPart2();

    /**
	 * @param part2
	 * @uml.property  name="part2"
	 */
    public void setPart2(String part2);
}