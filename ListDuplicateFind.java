package javaPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDuplicateFind {

	public static void main(String[] args) {
		
		List<String> list =Arrays.asList("Abhi","ravi","Abhi");
		Set<String> ele=new HashSet<>();
		
		for(String name:list)
		{
			System.out.println(ele.add(name));
		}
		

	}

}
