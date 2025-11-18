package com.Assignment;

public class ThreadWithRunnableInterface {

	public static void main(String[] args) {

		class ClassA implements Runnable
		{
			@Override
			public void run()
			{
				for(int i=0;i<50;i++)
				{
					System.out.println(" Class A");
				}
			}
		}
		
		class ClassB implements Runnable
		{
			@Override
			public void run()
			{
				for(int i=0;i<50;i++)
				{
					System.out.println(" Class B");
				}
			}
		}
		ClassA Classa=new ClassA();
		ClassB Classb=new ClassB();
		Thread t1 =new Thread(Classa);
		Thread t2=new Thread(Classb);
		t1.start();
		t2.start();
		
	}

}
