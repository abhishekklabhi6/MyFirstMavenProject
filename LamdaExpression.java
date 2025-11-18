package com.Assignment;

public class LamdaExpression {
	@FunctionalInterface
	public interface ClassA
	{
		public int calculate(int a,int b);
	}

	public static void main(String[] args) {
		ClassA classA=(a,b)->a+b;
		int sum=classA.calculate(5,5);
		System.out.println(sum);
	}

}
