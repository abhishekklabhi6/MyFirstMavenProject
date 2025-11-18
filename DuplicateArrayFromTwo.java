package javaPrograms;

public class DuplicateArrayFromTwo {
	
	public static void main(String[] args) {
		int array1 []= {1,3,5,6};
		int array2 []= {3,5,7,1};
		int resultarray [] = new int[array1.length];
		for(int i=0,k=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array1[i]==array2[j])
				{
					resultarray[k++]=array1[i];
				}
			}
		}
		for(int i=0;i<resultarray.length;i++)
		{
			if(resultarray[i]==0)
			{
				continue;
			}
			
			System.out.println(resultarray[i]);
		}
	}

}
