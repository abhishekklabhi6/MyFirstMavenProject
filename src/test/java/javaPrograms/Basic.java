package javaPrograms;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		
		System.out.println(getTestData());
		
	}
	
	public static Object[] getTestData()
	{
		String email[][]=new String[1][4];
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<4;j++)
			{
		email[i][j]= "dfffgfgg@gmail.com";
			}
		}
		
	return email;
	}

}
