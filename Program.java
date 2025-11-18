package com.Assignment;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		String name="abca";
		char res= repeat(name);
		System.out.println(res);
		
	}
	
	public static char repeat(String name)
	{
		char ch[]=name.toCharArray();
		char result=0;
		Set<Character> set=new HashSet<>();
		for(char ch1:ch)
		{
			boolean indicator=set.add(ch1);
			if(!indicator)
			{
				result=ch1;
			}
		}
		return result;
	}

}
