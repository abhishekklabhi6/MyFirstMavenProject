package com.Assignment;

import java.util.Arrays;
import java.util.Collections;

public class ArrayPrioh {

	public static void main(String[] args) {

		Integer arr []= {5,-9,8,5,2,7,5};
		Arrays.sort(arr,Collections.reverseOrder());
		int sum=0;
		for(int i=0;i<4;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
