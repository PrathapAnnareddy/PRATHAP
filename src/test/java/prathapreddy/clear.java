package prathapreddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https:www.google.com");
	String value = "500";
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).getAttribute("width");
	System.out.println(value);    
	
}
}
