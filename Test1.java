package javaPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		String path="";
		FileInputStream fin =new  FileInputStream(path);
		int content =fin.read();
		String emptyString="";
		while(content!=-1)
		{
			emptyString = emptyString + ((char)content);
			content=fin.read();
		}
		char [] ch = emptyString.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(char charter:ch)
		{
			map.put(charter, map.getOrDefault(charter, 0)+1);
		}
		int max=0;
		char maxcharcter = 0;
		for(Map.Entry<Character,Integer>mapkey:map.entrySet())
		{
			if(mapkey.getValue()>max)
			{
				max=mapkey.getValue();
				maxcharcter=mapkey.getKey();
			}
		}
		System.out.println("max repeated word"+ maxcharcter);
		
	}
}
