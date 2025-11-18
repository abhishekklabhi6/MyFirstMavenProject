package com.Assignment;

public class Factorail {

	public static void main(String[] args) {
		int num =4;
		int sum=0;
		int prod=1;
		for(int i=num;i>0;i--)
		{
			prod=prod*i;
		}
		sum=sum+prod;
		System.out.println(sum);
	}

}
