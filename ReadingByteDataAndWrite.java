package javaPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadingByteDataAndWrite {

	public static void main(String[] args) {
		try
		{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		fin=new FileInputStream("C:\\Users\\User\\Documents\\Sample.txt");
		fout=new FileOutputStream("C:\\Users\\User\\Documents\\Samplecopy.txt");
		int content;
		while((content=fin.read())!=-1)
		{
			fout.write(content);
		}
		if(fin!=null)
		{
			fin.close();
		}
		if(fout!=null)
		{
			fout.close();
		}
		}
		catch(Exception e)
		{
			e.getCause();
		}
	}

}
