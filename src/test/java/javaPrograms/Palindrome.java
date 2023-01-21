package javaPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int p=num%10;
			sum=(sum*10)+p;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println(temp +": is a palindrome");
		}

		else
		{
			System.out.println(temp +": is not a palindrome");
		}

	}

}
