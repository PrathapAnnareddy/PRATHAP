package Annareddy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet4 {
public static void main(String[] args) throws Throwable {
FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\prathapreddy\\src\\main\\resources\\Book4.xlsx");
Workbook wb=WorkbookFactory.create(fis);
double data=wb.getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
System.out.println(data);
}
}
