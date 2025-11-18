package javaPrograms;

public class Test {

	public static void main(String[] args) {

		//int ar[]=new int[4];
		int ar[]= {3,2,3,4};
		//System.out.println(ar.length);
		for(int i=0,k=0;i<ar.length;i++)
		{
			for(int j=1;j<=ar.length-1-i;j++)
			{
				
				if(ar[i]==ar[j])
				{
					continue;
				}
				else
				{
					System.out.println(ar[i]);
				}
			}
		}
		//System.out.println(ar.length);
		
	}

}
