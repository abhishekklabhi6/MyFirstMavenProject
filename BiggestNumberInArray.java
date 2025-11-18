package javaPrograms;

public class BiggestNumberInArray {

	public static void main(String[] args) {
		int a[]= {1,8,3,4};
		int big=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>big)
			{
				big=a[i];
			}
		}
		System.out.println(big);
	}

}
