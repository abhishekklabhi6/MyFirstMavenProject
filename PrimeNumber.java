package javaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int numbr=7 , i=2;
		int count=0;
		while(i<numbr)
		{
			if(numbr%i!=0)
			{

			}
			else
			{
				count++;
			}
			i++;
		}
		if(count==0)
		{
			System.out.println(numbr+ " : is a prime number");
		}
		else
		{
			System.out.println(numbr+ " : is not a prime number");
		}

	}

}
