package javaPrograms;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteTheDataIntoPropertiesFile {

	public static void main(String[] args) {

		try
		{
			String path="C:\\Users\\User\\eclipse-workspace\\MyMavenProject\\src\\test\\resources\\TestData\\datanew.properties.txt";
			FileOutputStream fout=new FileOutputStream(path,true);
			Properties pro=new Properties();
			pro.setProperty("name","india");
			pro.setProperty("nametwo","aus");
			pro.store(fout,"first file");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
