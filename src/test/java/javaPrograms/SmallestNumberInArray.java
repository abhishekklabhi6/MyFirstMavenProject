package javaPrograms;

public class SmallestNumberInArray {

	public static void main(String[] args) {
int a[]= {1,8,3,4};
int small=a[0];
for(int i=0;i<a.length;i++)
{
	if(a[i]<small)
	{
		small=a[i];
	}
}
System.out.println(small);

	}

}
