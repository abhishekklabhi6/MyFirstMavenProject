package javaPrograms;

public class Thread2 implements Runnable {

	/*
	 * @Override public void run () { System.out.println(" thread 2"); }
	 */
	MathUtilits mu;
	public Thread2(MathUtilits mu)
	{
		this.mu=mu;
	}
	public void run()
	{
		mu.getMathUtilits(2);
	}
}
