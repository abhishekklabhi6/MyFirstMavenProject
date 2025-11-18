package javaPrograms;

public class StrongNumber {

	public static void main(String[] args) {
		int n=145;
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			int prod=1;
			while(d>0)
			{
				prod=prod*d;
				d--;
			}
			sum=sum+prod;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" : is a strong number");
		}
		else
		{
			System.out.println(temp+" : is not a strong number");
		}
	}

}
