package javaPrograms;

public class OverloadingProgram {
	
	public static int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	
	public static int add(int a,int b,int c)
	{
		int sum=a+b+c;
		return sum;
	}
	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println(add(a,b));
	}

}
