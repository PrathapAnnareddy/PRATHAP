package prathapreddy;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newprogram {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	Set<String>allhandles=driver.getWindowHandles();
	for(String str1:allhandles)
	{
		System.out.println();
	}
	
}
}
