package javaPrograms;

public class Basic {

	public static void main(String[] args) {

		Object[][] ob=getTestData();
		for(int i=0;i<ob.length;i++)
		{
			for(int j=0;j<ob[0].length;j++)
			{
				System.out.println(ob[i][j]);
			}
		}
	}

	public static Object[][] getTestData()
	{
		String email[][]=new String[1][4];
		for(int i=0;i<email.length;i++)
		{
			for(int j=0;j<email[0].length;j++)
			{
				email[i][j]= "abhi"+j;
			}
		}

		return email;
	}

}
