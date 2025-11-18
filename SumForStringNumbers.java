package javaPrograms;

public class SumForStringNumbers {

	public static void main(String[] args) {

		String a = "S$22+226";
		char ch[]=a.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==45 || ch[i]>=48 && ch[i]<=57 )
			{
				if(ch[i]==45)
				{
					sum=sum - Character.getNumericValue(ch[i+1]);
					i=i+1;
				}
				else
				{
				sum=sum+Character.getNumericValue(ch[i]);
				}
			}
		}
		System.out.println(" the sum of each digit number in a string : " + sum);
		int num=45;
		char cc=(char)num;
		System.out.println(cc);
	}

}

