package javaPrograms;

public class Cricket {
	
	String name;
	int bal;
	
	{
		System.out.println("ideot");
	}
	Cricket()
	{
		System.out.println("default constructor");
	}
	Cricket(String name,int bal)
	{
		this();
		this.name=name;
		this.bal=bal;
	}
	
	public void print()
	{
		System.out.println(name);
		System.out.println(bal);
	}
	
}
