package prathapreddy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
	public static void main(String args[]) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\HP\\Desktop\\Screenshot\\google page.jpg");
		Files.copy(src, dest);
	}
	}

