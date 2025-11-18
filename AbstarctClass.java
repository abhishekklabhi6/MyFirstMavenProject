package javaPrograms;

public abstract class AbstarctClass {
	
	final String a="name";
	static String name="abhi";
	public static void staticMethod()
	{
		System.out.println("this is staticMethod");
	}
	
	public  void nonstaticMethod()
	{
		System.out.println("this is nonstaticMethod");
	}
	
	public abstract void abstractMethod();

}
