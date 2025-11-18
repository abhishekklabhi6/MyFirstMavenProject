package javaPrograms;

public class MathUtilits {

	void getMathUtilits(int n)
	{
		synchronized(this) {
			for(int i=1;i<5;i++)
			{
				try
				{
					System.out.println(n*i);
					Thread.sleep(400);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
