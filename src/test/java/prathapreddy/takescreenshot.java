package prathapreddy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takescreenshot {
public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com");
TakesScreenshot ts=(TakesScreenshot )driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\HP\\Desktop\\reddys\\flipkartpage.jpg");
Files.copy(src, dest);
}
}
