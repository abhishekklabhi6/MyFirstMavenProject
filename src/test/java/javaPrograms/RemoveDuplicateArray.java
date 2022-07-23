package javaPrograms;

public class RemoveDuplicateArray {

	public static void main(String[] args) {

		int a[]= {3,6,7,6,9};
		int b[]=a;
		for(int j=0;j<a.length;j++)
		{
			int count=0;
		for(int i=1;i<a.length-1;i++)
		{
			if(a[j]==b[i+1])
			{
				count++;
			}
			if(count>0)
			{
				System.out.println(a[j]);
				break;
			}
		}
		
		}
	}

}
