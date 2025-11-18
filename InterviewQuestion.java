package javaPrograms;

public class InterviewQuestion {

	public static void main(String[] args) {
		int arr[]= {-3,-3,1,-5,-8,2,-7,9,-4};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int prod=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				continue;
			}
			else 
			{
				prod=prod*arr[i];
			}
			
		}
		System.out.println(prod);

	}

}
