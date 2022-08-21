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
		String email[][]=new String[1][3];
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<3;j++)
			{
		email[i][j]= "dfffgfgg@gmail.com";
			}
		}
		
	return email;
	}

}
