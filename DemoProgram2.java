package com.Assignment;

public class DemoProgram2 {

	public static void main(String[] args) {
		
		int size =10;
		
		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i*2-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
