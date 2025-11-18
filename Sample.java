package com.Assignment;

public class Sample {

	public static void main(String[] args) {
		
		String words ="I loves programming in java";
		String word[]=words.split(" ");
		String firstLargest="";
		String secoundLargest="";
		int first=0;
		int secound=0;
		for(int i=0;i<word.length;i++)
		{
			if(word[i].length()>first)
			{
				secoundLargest=firstLargest;
				secound=first;
				firstLargest=word[i];
				first=word[i].length();
			}
			else if(word[i].length()>secound)
			{
				secoundLargest=word[i];
				secound=word[i].length();
			}
		}
		System.out.println("The Secound largest word ia n a given sentence is : "+secoundLargest);
		

	}

}
