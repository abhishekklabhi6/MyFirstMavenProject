package com.Assignment;

public class FGGHhj {

	public static void main(String[] args) {

		String str= "hello world india";
		String word[]=str.split(" ");
		String result []=new String[word.length];
		for(int i=0;i<word.length;i++)
		{
			String dummy="";
			char [] ch=word[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]>='a'&&ch[j]<='z')
				{
					if(j==0)
					{
						dummy=dummy+(char)(ch[j]-32);
					}
					else
					{
						dummy=dummy+ch[j];
					}
				}
			}
			result[i]=dummy;
			
		}
		String finalResult="";
		String sum="";
		for(int i=0;i<result.length;i++)
		{
			finalResult=result[i]+" ";
			sum=sum+finalResult;
		}
		
	System.out.println(sum.strip());
	}
	

}
