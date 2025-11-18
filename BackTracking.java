package com.Assignment;

import java.util.ArrayList;
import java.util.List;

public class BackTracking {

    public static void main(String[] args) {
        int num[] = {1, 2};
        List<List<Integer>> results = checkResult(num);
        for (List<Integer> result : results) {
            System.out.println(result);
        }
    }

    public static List<List<Integer>> checkResult(int[] num) {
        List<List<Integer>> result = new ArrayList<>();
        checkBacktracking(result, new ArrayList<>(), num);
        return result;
    }

    public static void checkBacktracking(List<List<Integer>> result, 
                                        List<Integer> current, 
                                        int[] num) {
        // Base case: when current permutation size equals input array length
        if (current.size() == num.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = 0; i < num.length; i++) {
            if (current.contains(num[i])) {
                continue;
            } else {
                current.add(num[i]);
                checkBacktracking(result, current, num);
                current.remove(current.size() - 1);
            }
        }
    }
}