package prathapreddy;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class fileinputstream {
	private static final Reader FileInputStream = null;

	public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\prathapreddy\\src\\test\\resources\\credentials.properties");
	Properties p=new Properties();
	p.load(fis);
	String prathap=p.getProperty("BROWSER");
	System.out.println(prathap);
	
	}
}
