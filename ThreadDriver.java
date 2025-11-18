package javaPrograms;

public class ThreadDriver {

	public static void main(String[] args) {
		/*
		 * int n=5; for(int i=0;i<n;i++) { Thread1 t1= new Thread1(); t1.start(); Thread
		 * t2= new Thread(new Thread2()); t2.start(); }
		 */
		MathUtilits mu=new MathUtilits();
		Thread1 t1=new Thread1(mu);
		Thread t2 =new Thread(new Thread2(mu));
		t1.start();
		t2.start();
		
	}
}