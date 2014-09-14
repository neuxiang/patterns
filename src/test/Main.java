package test;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		User user1 = new User();
//		user1.setAge(1);
//		user1.setMarital(true);
//		user1.setName("A");
//
//		User user2 = new User();
//		user2.setAge(2);
//		user2.setMarital(true);
//		user2.setName("B");
		
		BaseADTFilter filter = new BaseADTFilter(); 
		filter.setName("name");
		List<String> list = new ArrayList<String>();
		list.add("B");
		filter.setValue(list);
		
//		Element element1 = new ADTAdapter(user1);
//		Element element2 = new ADTAdapter(user2);
		
		BaseAdtList<User> baseAdtList = new BaseAdtList<User>();
//		baseAdtList.add(element1);
//		baseAdtList.add(element2);
		
		BaseAdtList<User> filterList= baseAdtList.filter(filter);
		List<User> allList = filterList.getAllList();
		for(User user: allList)
		{
//			System.out.println(user.getName());
		}
		
		
		
		
	}

}
