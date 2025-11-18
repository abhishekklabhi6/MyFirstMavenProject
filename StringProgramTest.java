package javaPrograms;

public class StringProgramTest {

	public static void main(String[] args) {
		  String sr="WelcomeTo123Indian@1345#";
	        char ch[]=sr.toCharArray();
	        for(int i=0;i<ch.length;i++)
	        {
	            if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z')
	            {
	                continue;
	            }
	            else
	            {
	                System.out.println(ch[i]);
	            }
	        }

	}

}
