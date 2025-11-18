package com.Assignment;

import java.util.HashMap;
import java.util.Map;

public class Example {

	public static void main(String[] args) {

		String name ="swiss";

		char ch[]=name.toCharArray();

		Map<Character,Integer> map=new HashMap<>();

		for(char cc: ch)
		{
			map.put(cc,map.getOrDefault(cc,0)+1);
		}


		for(Map.Entry<Character,Integer> inmap:map.entrySet())
		{
			if(inmap.getValue()<=1)
			{
				System.out.println("the first non repating charcter : "+inmap.getKey());
				break;
			}
		}


	}

}
