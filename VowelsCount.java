package javaPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class VowelsCount {

	public static void main(String[] args) {

		Set<Character>l=new LinkedHashSet<>();
		String name="abhisshek";
		char[] ch=name.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		 l.add(ch[i]);
		}
		System.out.println(l);
	}

}
