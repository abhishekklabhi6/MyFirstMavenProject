package javaPrograms;

import java.lang.reflect.Method;

public class DriverForAnnotation {

	@MycustomAnnotion(value=10)
	public void run()
	{
		System.out.println(" custom snmnotaion");
	}

	public static void main(String[] args) 
	{
		DriverForAnnotation driverForAnnotation=new DriverForAnnotation();
		try
		{
			
		Method runMethod=driverForAnnotation.getClass().getMethod("run");
		MycustomAnnotion mMycustomAnnotion=runMethod.getAnnotation(MycustomAnnotion.class);
		System.out.println(" value of the cusom annotation : "+ mMycustomAnnotion.value());
		}
		catch(Exception e)
		{
			System.out.println(e.getCause());
		}
	}
	

}
