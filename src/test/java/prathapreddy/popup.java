package prathapreddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class popup {
	public static void main(String[] args) throws Throwable {
	ChromeOptions c=new ChromeOptions();
	c.addArguments("--disable-notifications");
	c.addArguments("start-maximized");
	//open browser
	WebDriver driver=new ChromeDriver(c);
	Thread.sleep(3000);
	//driver.manage().window().maximize();
	driver.get("https://www.hdfc.com");
	}
	
}

