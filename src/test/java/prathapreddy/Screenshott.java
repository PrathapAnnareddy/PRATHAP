package prathapreddy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Screenshott {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in");
    WebElement abc=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
	File src=abc.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\HP\\Desktop\\PPP\\amazonlogo.jpg");
	Files.copy(src, dest);
	
}
}
