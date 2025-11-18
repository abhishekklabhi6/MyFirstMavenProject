package javaPrograms;

public class StringProgramTest2 {

	public static void main(String[] args) {
		 String sr="AbhiShek";
	        char ch[]=sr.toCharArray();
	        String name="";
	        for(int i=0;i<ch.length;i++)
	        {
	            if(ch[i]>='A'&&ch[i]<='Z')
	            {
	                name=name+(char)(ch[i]+32);
	            }
	            else
	            {
	                name=name+ch[i];
	            }
	        }
	        System.out.println("Converted lower case string is : "+name );

	}

}
