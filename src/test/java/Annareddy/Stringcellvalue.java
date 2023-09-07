package Annareddy;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Stringcellvalue {
public static void main(String[] args) throws Throwable, IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\prathapreddy\\src\\main\\resources\\Stringcell.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String ss=wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(ss);
}
}
