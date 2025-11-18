package com.Assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorCustumComparater {

    // Make the class static and properly parameterize Comparator
    public static class ClassA implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            // Custom logic: if o1 is divisible by o2, put it first
            if (o1>02) {
                return 1; // o1 comes before o2
            }
			return o2;
        }
    }

    public static void main(String[] args) {
        List<Integer> lis = Arrays.asList(6, 8, 2, 3, 1, 4);
        
        // Create comparator instance and sort the list
        ClassA customComparator = new ClassA();
        lis.sort(customComparator);
        
        System.out.println("After compare with our custom logic:");
        System.out.println(lis);
    }
}