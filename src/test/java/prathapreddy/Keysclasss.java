package prathapreddy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Keysclasss {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.actitime.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
}
}
