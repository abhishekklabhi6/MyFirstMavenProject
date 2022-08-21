package javaPrograms;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataExcelFile {

	public static void main(String[] args) throws Exception {

		String Path="C:\\Users\\User\\eclipse-workspace\\MyMavenProject\\src\\test\\resources\\TestData\\Book1.xlsx";
		String counmName[]= {"username","Password","result"};
		Workbook wb=new XSSFWorkbook();
		for(int k=0;k<3;k++)
		{
		Sheet sheet=wb.createSheet("crickTeam"+k);
		for(int i=0;i<3;i++)
		{
			Row row=sheet.createRow(i);
			
			for(int j=0;j<3;j++)
			{
				if(i==0)
				{
					Cell cell=row.createCell(j);
					cell.setCellValue(counmName[j]);

				}
				else
				{
				Cell cell=row.createCell(j);
				cell.setCellValue(String.valueOf(Math.random()).substring(10));
				}
			}
		}
		}
		FileOutputStream fout=new FileOutputStream(Path);
		wb.write(fout);
		fout.close();
		System.out.println("file writed sucessfully");
	}

}
