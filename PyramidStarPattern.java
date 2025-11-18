package com.Assignment;

public class PyramidStarPattern {

	public static void main(String[] args) {

		int size=5;
		for(int i=1;i<=size;i++)
		{
			for(int j=i;j<size;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2-1);k++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
