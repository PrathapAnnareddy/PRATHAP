package prathapreddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getting {

	private static final String TimeUnit = null;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
	//	System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());	
	}
}
