package com.Assignment;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SumForStringNumbers {

    public static void main(String[] args) {
        String a = "S$22+226";
        System.out.println("Input string: " + a);
        System.out.println("Sum: " + sumNumbersRegex(a));
        
        // Test with negative numbers
        String b = "abc-123def45gh-67";
        System.out.println("Input string: " + b);
        System.out.println("Sum: " + sumNumbersRegex(b));
    }
    
    public static int sumNumbersRegex(String str) {
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(str);
        int sum = 0;
        
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }
        
        return sum;
    }
}
