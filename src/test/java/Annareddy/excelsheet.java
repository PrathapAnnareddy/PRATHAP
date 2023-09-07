package Annareddy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.SheetBuilder;

public class excelsheet {
public static void main(String[] args) throws Throwable {
	//create object of fis class
	FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\prathapreddy\\src\\main\\resources\\Book1.xlsx");
	//open the workbook using create method
	Workbook wb=WorkbookFactory.create(fis);
	//navigate to sheet
	Sheet sh=wb.getSheet("Sheet1");
	String data=sh.getRow(0).getCell(2).getStringCellValue();
	System.out.println(data);
	}
}
