package javaPrograms;

public class RemoveDuplicateArray {

	public static void main(String[] args) {

		int a[]= {6,8,8,9,6};
		for(int k=0;k<a.length;k++)
		{
			int count=0;
			for(int i=0;i<a.length-k-1;i++)
			{
				if(a[k]==a[k+i+1])
				{
		            count++;
				}
			}
			if(count==0)
			{
			System.out.println(a[k]);
			}
			
		}
		

	}

}
