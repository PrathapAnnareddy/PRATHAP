package Annareddy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchdataex1 {
public static void main(String[] args) throws Throwable, IOException {
FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\prathapreddy\\src\\main\\resources\\Book3.xlsx");
Workbook wb=WorkbookFactory.create(fis);
Sheet sh=wb.getSheet("Nanna");
String data=sh.getRow(1).getCell(3).getStringCellValue();
System.out.println(data);
}
}
