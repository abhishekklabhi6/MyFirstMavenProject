package javaPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateArrayInSet {

	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		System.out.println("enter the size of the array");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println(" enter array number");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
		set.add(a[i]);
		}
		
System.out.println(set);
	}

}
