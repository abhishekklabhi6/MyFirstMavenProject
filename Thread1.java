package javaPrograms;

public class Thread1 extends Thread {
	
	/*
	 * @Override public void run () { System.out.println(" thread 1"); }
	 */
	MathUtilits mu;
	public Thread1(MathUtilits mu)
	{
		this.mu=mu;
	}
	public void run()
	{
		mu.getMathUtilits(1);
	}
}
