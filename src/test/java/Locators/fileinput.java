package Locators;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class fileinput {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\prathapreddy\\src\\main\\resources\\raju.properties");
	Properties p=new Properties();
	p.load(fis);
	String prathap=p.getProperty("pwd");
	System.out.println(prathap);
	System.out.println("hello im pratap");
	
	}
}
