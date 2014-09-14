package com.example.pattern.build.simpleFactory;

/**
 * JDBC is using this pattern 
 * @author Shawn
 *
 */

public class Client {

	public static void main(String[] args){
		System.out.println(Factory.getProduct("IPad").getDescription());
		System.out.println(Factory.getProduct("IPhone").getDescription());
		System.out.println(Factory.getProduct("IPod").getDescription());
	}
}
