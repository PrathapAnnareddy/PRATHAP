package prathapreddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenable {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement button=driver.findElement(By.xpath("//button[@name='login']"));
	Thread.sleep(3000);
	if(button.isEnabled()) {
		System.out.println("element is enabled");
	}
	else {
		System.out.println("element is disabled");
	}
	
	
}
}
