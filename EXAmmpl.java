package com.Assignment;

import java.util.Arrays;

public class EXAmmpl {

	public static void main(String[] args) {
		
		String s1 ="listen";
		String s2="silent";
		boolean result =checkAnagrams(s1,s2);
		if(result)
		{
			System.out.println(" it is anagrams");
		}
		else
		{
			System.out.println(" it is not anagrams");
		}
		
	}
	public static boolean checkAnagrams(String s1 ,String s2)
	{
		char[] cc1=s1.toCharArray();
		char[] cc2=s2.toCharArray();
		Arrays.sort(cc1);
		Arrays.sort(cc2);
		
		if(cc1.length!=cc2.length)
		{
			return false;
		}
		if(Arrays.equals(cc1, cc2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
