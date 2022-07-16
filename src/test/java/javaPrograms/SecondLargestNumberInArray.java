package javaPrograms;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		int a[]= {5,1,6,8,9,9};
		int first=0;
		int second=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>first)
			{
				second=first;
				first=a[i];
			}
			else if(a[i]>second&&a[i]!=first)
			{
				second=a[i];
			}
		}
		System.out.println(second);
	}
}
