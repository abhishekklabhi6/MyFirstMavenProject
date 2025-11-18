package javaPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListProgram {

	public static void main(String[] args) {

		List<Object> list=new ArrayList<>();

		list.add("abhi");
		list.add("subrmaya");
		list.add(455.787);
		list.add(false);
		list.add('r');
		list.add(66776.677f);
		list.add("abhi");
		list.add(null);
		@SuppressWarnings("rawtypes")
		Iterator iterator =list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println(list);
	}

}
