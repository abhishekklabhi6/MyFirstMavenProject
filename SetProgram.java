package javaPrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetProgram {

	public static void main(String[] args)
	{

		Set<Object> set=new LinkedHashSet<Object>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(6);
		set.add(6);
		System.out.println(set);
		
		List<Object> arrayList=new ArrayList<Object>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(10);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		System.out.println(arrayList);
		
		List<Object> linkedList=new LinkedList<Object>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(10);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(10);
		System.out.println(linkedList);

	}


}