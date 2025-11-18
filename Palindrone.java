package com.Assignment;

public class Palindrone {

	public static void main(String[] args) {

		int num=1221;
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int lastDigit=num%10;
			sum=(sum*10)+lastDigit;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+ " is palindrome");
		}
		else
		{
			System.out.println(temp+ " is not palindrome");
		}
	}

}
