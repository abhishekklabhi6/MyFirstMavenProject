package com.Assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorCustumComparaterOwnLogic {

	public static void main(String[] args) {

		List<Integer> lis=Arrays.asList(6,8,2,3,1,4);
		lis.sort((a,b)->b.compareTo(a));
		System.out.println(lis);
		
	}

}
