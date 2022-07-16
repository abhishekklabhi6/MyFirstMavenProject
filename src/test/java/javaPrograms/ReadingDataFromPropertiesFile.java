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
			String path="/MyMavenProject/src/test/resources/TestData/data.properties.txt";
			FileInputStream fin=new FileInputStream(path);
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
