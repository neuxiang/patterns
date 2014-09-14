/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.abstractFactory
 * 
 * �ļ����� Client.java
 * 
 */
package com.example.pattern.build.abstractFactory;


/**
 * ������ <p> <a href="Client.java.html"><i>View Source</i></a> </p>
 * @author              Kingfish
 * @version             1.0
 * @uml.dependency   supplier="com.example.pattern.build.abstractFactory.ConcreteFactory2"
 * @uml.dependency   supplier="com.niufish.pattern.abstractFactory.ConcreteFactory1"
 * @uml.dependency   supplier="com.niufish.pattern.abstractFactory.ConcreteFactory2"
 */
public class Client {

    	
		
		public static void main(String[] args){
		
		        AbstractFactory factory = new ConcreteFactory1();
		        System.out.println(factory.createProductA().toString());
		        System.out.println(factory.createProductB().toString());
		        factory = new ConcreteFactory2();
		        System.out.println(factory.createProductA().toString());
		        System.out.println(factory.createProductB().toString());
		     }
}
