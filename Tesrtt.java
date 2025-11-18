package javaPrograms;

public class Tesrtt {

	public static void main(String[] args) {

		String sr="I live in bengolre";

		int firstLargest = 0,secoundLaegest=0;
		String firstLargestWord = "",secoundLaegestWord="";
		String [] neewstring=sr.split(" ");
		for(int i=0;i<neewstring.length;i++)
		{
			if(neewstring[i].length()>firstLargest)
			{
				secoundLaegest=firstLargest;
				secoundLaegestWord=firstLargestWord;
				firstLargest=neewstring[i].length();
				firstLargestWord=neewstring[i];
			}
			else if(neewstring[i].length()>secoundLaegest)
			{
				secoundLaegest=neewstring[i].length();
				secoundLaegestWord=neewstring[i];
			}
				
		}
		

		System.out.println(" the seconfLargest is : " +secoundLaegestWord);
	}

}
