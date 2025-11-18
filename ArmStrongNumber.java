package javaPrograms;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int number=154;
		int temp=number;
		int sum=0;
		while(number>0)
		{
			int d=number%10;
			int count=countNumber(temp);
			int pro=1;
			while(count>0)
			{
				pro=pro*d;
				count--;
			}
			sum=sum+pro;
			number=number/10;
		}
		
		if(sum==temp)
		{
			System.out.println(temp+" : is a armstrong number");
		}
		else
		{
			System.out.println(temp+" : is not a armstrong number");
		}
	}

	public static int countNumber(int num)
	{
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		return count;
	}

}