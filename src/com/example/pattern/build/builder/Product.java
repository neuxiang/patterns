/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.builder
 * 
 * �ļ����� Product.java
 * 
 */
package com.example.pattern.build.builder;

/**
 * ��Ʒ�ĳ��� <p> <a href="Product.java.html"><i>View Source</i></a> </p>
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