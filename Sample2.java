package com.Assignment;

public class Sample2 {

	public static void main(String[] args) {
		
		String word ="I love programming";
		int firstLargest =0 ;
		String largest="";
		String [] name=word.split(" ");
		for(int i=0;i<name.length;i++)
		{
			if(name[i].length()>firstLargest)
			{
				firstLargest=name[i].length();
				largest=name[i];
			}
		}
		
		System.out.println("the largest : "+largest);

	}

}
