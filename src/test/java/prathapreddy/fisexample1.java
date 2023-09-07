package prathapreddy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class fisexample1 {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\prathapreddy\\src\\main\\resources\\vani.properties");
	Properties p=new Properties();
	p.load(fis);
	String text=p.getProperty("username");
	System.out.println(text);
}
}
