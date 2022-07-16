package javaPrograms;

public class Fruits {

	int a;
	int b;
	Fruits()
	{
		System.out.println("this is empty constructor");
	}
	Fruits(int a, int b)
	{
		this();
		this.a=a;
		this.b=b;
		System.out.println("this is paramertized constuctor");
	}

	public void print()
	{
		System.out.println(a);
	}
	{
		System.out.println("intial block exceuted");
	}

}
