package prathapreddy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screen {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https:www.google.com");
	WebElement abc=driver.findElement(By.xpath("\\div[@id='logo']"));
	File src=abc.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\HP\\Desktop\\prathap\\googlepage.jpg");
	Files.copy(src, dest);
	
	}
}
