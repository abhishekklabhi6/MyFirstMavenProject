package javaPrograms;

public class FibbinoSeries {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		int max=100;
		int sum=0;
		while(sum<100)
		{
			sum=first+second;
			first=second;
			second=sum;
			System.out.println(sum);
		}
	}
}
