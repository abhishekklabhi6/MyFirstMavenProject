package javaPrograms;

public class UpperCaseString {

	public static void main(String[] args) {
		String a="abhiShek";
		String b="";
		char ch[]=a.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(a.charAt(i)>='a'&&a.charAt(i)<'z')
			{
				b=b+(char)(a.charAt(i)-32);
			}
			else
			{
				b=b+a.charAt(i);
			}
		}



		System.out.println(b);
	}

}
