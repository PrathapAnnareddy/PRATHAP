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

public class particularelescreen {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	TakesScreenshot ts=(TakesScreenshot)driver;
	WebElement abc=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	File src=abc.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\HP\\Desktop\\annayya\\requestlogo.jpg");
	Files.copy(src, dest);
}
}
