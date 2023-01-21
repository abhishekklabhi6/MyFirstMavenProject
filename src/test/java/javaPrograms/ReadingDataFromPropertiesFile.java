package javaPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadingDataFromPropertiesFile {


	public static void main(String[] args)
	{

		try
		{
			String Path=System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\datanew.properties.txt";
			System.out.println(Path);
			FileInputStream fin=new FileInputStream(Path);
			Properties pro=new Properties();
			pro.load(fin);
			Set<Object> key=pro.keySet();
			for(Object obj:key)
			{
				System.out.println(pro.get(obj));
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
