package prathapreddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
	driver.switchTo().frame("iframeresult");
	//enter first name
	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("prathap");
	Thread.sleep(3000);
	//enter last name
	driver.findElement(By.xpath("//input[@id='annareddy']")).click();
	//click on submit button
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}
}
