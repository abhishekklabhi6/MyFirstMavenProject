package javaPrograms;

public class PalindromeProgram {

	public static void main(String[] args) {
int num=1221;
int temp=num;
int sum=0;
while(num!=0)
{
	int p=num%10;
	num=num/10;
	sum=(sum*10)+p;
	
}
if(sum==temp)
{
	System.out.println(temp +" is palindrome");
}
else
{
	System.out.println(temp +" is not palindrome");
}


	}

}
