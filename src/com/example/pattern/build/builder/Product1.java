/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.builder
 * 
 * 文件名称 Product1.java
 * 
 */
package com.example.pattern.build.builder;

/**
 * 具体产品类
 * <p>
 * <a href="Product1.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Product1 implements Product {
    
    /**
	 * @uml.property  name="_part1"
	 */
    private String _part1;
    
    /**
	 * @uml.property  name="_part2"
	 */
    private String _part2;
    
    public String getPart1() {
        return _part1;
    }
    public void setPart1(String part1) {
        this._part1 = part1;
    }
    public String getPart2() {
        return _part2;
    }
    public void setPart2(String part2) {
        this._part2 = part2;
    }
    
    public String toString(){
        return "part1:"+_part1+" part2:"+_part2;
    }
}
