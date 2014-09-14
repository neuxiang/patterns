package com.example.pattern.build.simpleFactory;

public class Factory {

	/**
	 * 调用者决定实现哪个子类
	 * @param productName
	 * @return
	 */
	public static Product getProduct(String productName)
	{
		String packageStr = "com.example.pattern.build.simpleFactory"; 
		Product product = null;
		try {
			product = (Product) Class.forName(packageStr+"."+productName).newInstance();
		} catch (InstantiationException e) {
			System.out.println("Fail to create new instance");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println("Illegal to create new instance");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
			e.printStackTrace();
		}
		
		
		return product;
	}
}
