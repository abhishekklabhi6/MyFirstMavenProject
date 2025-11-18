package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class StringProgram {

	 public static void main(String[] args) {
	        String sr="hiindiahi";
	        char ch[]=sr.toCharArray();
	        Map<Character,Integer> map=new HashMap<>();
	        for(Character val:ch)
	        {
	        map.put(val,map.getOrDefault(val, 0)+1);
	        }
	        for(Map.Entry<Character,Integer> inMap:map.entrySet())
	        {
	        	if(inMap.getValue()>1)
	        	{
	        	System.out.println("Duplicated charcter in a given string is : "+inMap.getKey());
	        	}
	        }
	        
	        
	    }

}
