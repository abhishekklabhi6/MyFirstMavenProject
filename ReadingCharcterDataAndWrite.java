package javaPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadingCharcterDataAndWrite {

	public static void main(String[] args) {
		try
		{
		FileReader fr=null;
		FileWriter fw=null;
		fr=new FileReader("C:\\Users\\User\\Documents\\Sample.txt");
		fw=new FileWriter("C:\\Users\\User\\Documents\\Samplenew.txt");
		int content;
		while((content=fr.read())!=-1)
		{
			fw.append((char)content);
		}
		if(fr!=null)
		{
			fr.close();
		}
		if(fw!=null)
		{
			fw.close();
		}
		}
		catch(Exception e)
		{
			e.getCause();
		}
	}


}
