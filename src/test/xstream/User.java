package test.xstream;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class User {
	@XStreamAlias("message") 
	public String name;
	private int age;
	static boolean marital;
	public List x = new ArrayList();
	void set(int age){
		this.age=age;
	}
	int get()
	{
		return this.age;
	}
	
}
