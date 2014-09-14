package test;

import java.util.ArrayList;
import java.util.List;

public class BaseADTFilter {

	List value = new ArrayList();
	String name;
	public List getValue() {
		return value;
	}
	public void setValue(List value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
