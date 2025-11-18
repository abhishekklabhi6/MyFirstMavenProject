package javaPrograms;

public class Polimorphism {

	public static void main(String[] args) {
		
		Sports sports[]=new Sports [2];
		sports[0]=new Cricket();
		sports[1]=new FootPlay();
		
		for(int i=0;i<sports.length;i++)
		{
			sports[i].print();
		}
		Cricket cr=(Cricket)sports[0];
		cr.plyCricket();

	}

}
