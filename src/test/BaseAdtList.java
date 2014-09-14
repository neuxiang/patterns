package test;

import java.util.ArrayList;
import java.util.List;

public class BaseAdtList<T extends BaseAdt> {

	List<Element> list = new ArrayList<Element>();
	User user1= new User();
//	Element element = new ADTAdapter(user1);

	
	public List<T> getAllList()
	{
		List<T> list2 = new ArrayList<T>();
		for(Element e:list)
		{
			list2.add( (T) e.getBaseAdt());
		}
		
		return list2;
	}
	
	public void add(Element e){
		list.add(e);
	}

	BaseAdtList<T> filter(BaseADTFilter filter)
	{
		BaseAdtList<T> filterList = new BaseAdtList<T>();
		List<?> value = filter.getValue();
		
		for(Element e: list)
		{
			if(value.contains(e.getName()))
			{
				filterList.add(e);
			}
		}
		return filterList;
		
		
	}
}
