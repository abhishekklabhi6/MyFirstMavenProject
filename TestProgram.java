package com.Assignment;

import java.util.HashMap;
import java.util.Map;

public class TestProgram {
	 
	 public static void main(String[] args) {
		
		String word = "abhisheekkkl";
		char ch[]=word.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(char ch1:ch)
		{
			map.put(ch1, map.getOrDefault(ch1, 0)+1);
		}
		for(Map.Entry<Character,Integer> inMap:map.entrySet())
		{
			if(inMap.getValue()==2)
			{
				System.out.println("the second highest repated charcter in a given sentence is : "+ inMap.getKey());
				break;
			}
		}
	 }

}
 
