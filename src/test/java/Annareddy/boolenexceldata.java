package Annareddy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class boolenexceldata {
public static void main(String[] args) throws Throwable, IOException {
FileInputStream fs=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\prathapreddy\\src\\main\\resources\\boolean.xlsx");
Workbook wb=WorkbookFactory.create(fs);
boolean data=wb.getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
System.out.println(data);
}
}
