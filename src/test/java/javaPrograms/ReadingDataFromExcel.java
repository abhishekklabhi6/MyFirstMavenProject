package javaPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel {

	public static void main(String[] args) {
	
try
{
			String path="C:\\Users\\User\\eclipse-workspace\\MyMavenProject\\src\\test\\resources\\TestData\\Book11.xlsx";
			FileInputStream fin=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fin);
			Sheet sheet=wb.getSheet("Sheet1");
			int rowCount=sheet.getPhysicalNumberOfRows();
			int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
			for(int i=0;i<rowCount;i++)
			{
				for(int j=0;j<cellCount;j++)
				{
					System.out.println(sheet.getRow(i).getCell(j).getStringCellValue().toString());
				}
			}
	}
catch(Exception e)
{
	  e.printStackTrace();
}
	}
}
