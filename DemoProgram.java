package com.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoProgram {

	public static void main(String[] args) {

		//int arr []= {3, 5, 7, 2, 6, 10};
		Scanner s =new Scanner(System.in);
		int size = s.nextInt();
		int arr[] =new int [size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int key =s.nextInt();
		boolean result =check(arr,key);
		if(result)
		{
		System.out.println(key +" is there in input array");
		}
		else
		{
			System.out.println(key +" is not there in input array");
		}

	}

	public static boolean check(int [] arr ,int key)
	{
		List<Integer> list =new ArrayList<>();
		for(int i :arr)
		{
			list.add(i);
		}
		if(list.contains(key))
		{
			return true;
		}
		else

		{
			return false;
		}
	}
}


