package prathapreddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	Actions a1=new Actions(driver);
	WebElement mainMenu=driver.findElement(By.xpath("//a[@aria-label='Gmail (opens a new tab)']"));
	a1.moveToElement(mainMenu).build().perform();
	
}
}
