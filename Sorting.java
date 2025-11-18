package javaPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
	public static void main(String[] args) {
		Integer arr []= {6,7,3,5};
		Arrays.sort(arr);
		System.out.println("Ascending ordeer"+Arrays.toString(arr));
		Arrays.sort(arr,Comparator.reverseOrder());
		System.out.println("Descending ordeer"+Arrays.toString(arr));
	}

}
