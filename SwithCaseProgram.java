package javaPrograms;

import java.util.Scanner;

public class SwithCaseProgram {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String name=sc.next();

		switch(name)
		{
		case "india":
			System.out.println("it is india");
			break;
		case "pak":
			System.out.println("it is pak");
			break;
		default:
			System.out.println("not matched any cases");
		}

	}

}
