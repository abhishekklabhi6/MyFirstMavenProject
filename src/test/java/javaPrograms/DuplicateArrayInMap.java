package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateArrayInMap {

	public static void main(String[] args) {

		Scanner s=new Scanner (System.in);
		System.out.println(" enter the size of the array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println(" enter array number");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			map.put(i,a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i])+1);
			}
			else
			{
				map.put(a[i],1);
			}
		}
	}
	

}
