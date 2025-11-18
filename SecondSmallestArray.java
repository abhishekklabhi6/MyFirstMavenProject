package javaPrograms;

public class SecondSmallestArray {

	public static void main(String[] args) {
		int a[]= {5,1,6,8,4,9};
		int firstSmall=a[0];
		int secondSmall=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<firstSmall)
			{
				secondSmall=firstSmall;
				firstSmall=a[i];
			}
			else if(a[i]<secondSmall&&a[i]!=firstSmall)
			{
				secondSmall=a[i];
			}
		}
		System.out.println(secondSmall);
	}

}
