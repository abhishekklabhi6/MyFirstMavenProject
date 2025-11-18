package com.Assignment;

public class DemoProgram3 {

	public static void main(String[] args) {

		//[4,6,8,9,2]
		String str = "L^%^*%&*^*(&*(Abhishek";
		String result="";
		char ch []=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z')
			{
				result+=ch[i];
			}
		}
		System.out.println(result);
		
	}

}
