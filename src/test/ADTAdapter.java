package test;

public class ADTAdapter implements Element{

	BaseAdt adt;
	String name;
	int age;
	boolean marital;
	
	public ADTAdapter(BaseAdt adt)
	{
		this.adt =adt;
		if(adt instanceof User)
		{
			User user = (User)adt;
			this.name= user.getName();
			this.age=user.getAge();
			this.marital=user.isMarital();
		}
	}
	
	
	public boolean getMartal() 
	{
		return this.marital;
	}

	public String getName()
	{
		return this.name;
	}

	public int getAge()
	{
		return this.age;
	}


	public <T extends BaseAdt> T getBaseAdt() {
		
		return (T) this.adt;
	}

	

}
