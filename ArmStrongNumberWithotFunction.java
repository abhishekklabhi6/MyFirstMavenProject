package javaPrograms;

import java.util.Scanner;

public class ArmStrongNumberWithotFunction {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int number=153;
		int temp =number;//153
		int numberTocountDigit=number;
		int sum=0;
		int count =0;
		int mul=1;
		while(numberTocountDigit>0)
		{
			numberTocountDigit =numberTocountDigit / 10;
			count ++;
		}
		int numberOfDigitsOfNumber=count;
		while(number>0)
		{
			int lastDigit=number%10;
			mul=1;
			numberOfDigitsOfNumber=count;
			while (numberOfDigitsOfNumber>0)
			{
			mul=mul*lastDigit;
			numberOfDigitsOfNumber--;
			}
			sum=sum+mul;
			number=number/10;
		}
		if (temp==sum)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}

}
