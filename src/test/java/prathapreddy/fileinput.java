package prathapreddy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fileinput {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\prathapreddy\\src\\test\\resources\\Annareddy.properties");
	Properties p=new Properties();
	p.load(fis);
	String bhanu=p.getProperty("URL");
	System.out.println(bhanu);
}
}
