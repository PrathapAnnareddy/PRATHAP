package prathapreddy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll3 {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.actiTime.com");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	driver.findElement(By.xpath("//a[@class='home-page__button home-page__button--start-trial button']")).click();
	jse.executeScript("window.scrollBy(0,5000)");
	Thread.sleep(4000);
	jse.executeScript("window.scrollBy(0,-2000)");
}
}
