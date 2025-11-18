package com.Assignment;

public class ClassA {

	public static void main(String[] args) {
		int size=4;
		for(int i=1;i<=size;i++)
		{
			for(int j=i;j<size;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
