package prathapreddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.truecaller.com/");
		driver.findElement(By.xpath("//span[text()='Accept All Cookies']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='tel']")).sendKeys("9502519507");
		
	}

}
