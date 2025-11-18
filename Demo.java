package com.Assignment;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		int arr[]= {1,3,4,1,4,5,6,7,6,1};
		System.out.println(Arrays.toString(remove(arr)));
		
	}
	
	public static int [] remove(int[] array)
	{
		if(array.length==0)
		{
			return array;
		}
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int n=1;
		for(int i=1;i<array.length;i++)
		{
			if(array[i]!=array[i-1])
			{
				n++;
			}
		}
		System.out.println(n);
		int result []=new int [n];
		result[0]=array[0];
		int j=1;
		
		for(int i=1;i<array.length;i++)
		{
			if(array[i]!=array[i-1])
			{
				result[j++]=array[i];
			}
		}
		return result;
	}

}
