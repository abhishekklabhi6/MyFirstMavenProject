package javaPrograms;

import java.util.Scanner;

public class PalindromeForCharcter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		String temp=name;
		String emptyString="";
		char ch[]=name.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			emptyString=name.charAt(i)+emptyString;
		}
		if(temp.equals(emptyString))
		{
			System.out.println(temp +": is a palindrome");
		}
		else
		{
			System.out.println(temp +": is not a palindrome");
		}
	}

}
