package javaPrograms;

public class Cricket extends Sports {


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

	public String toString()
	{
		return name; 
	}


	public void print()
	{
		super.print();
		System.out.println("cricket sub class");
	}

	public void plyCricket()
	{
		System.out.println("ply cricket");
	}

}
