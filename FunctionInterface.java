package com.Assignment;

public class FunctionInterface {
	
	@FunctionalInterface
	public interface ClassA
	{
		public void display();
	}

	public static void main(String[] args) {
		ClassA classA=new ClassA() {
			public void display()
			{
				System.out.println("hii");
			}
			
		};
		classA.display();
	}

}
