package prathapreddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehandle {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com");
	WebElement abc=driver.findElement(By.xpath("//a[@class='gb_y']"));
	Actions act=new Actions(driver);
	act.moveToElement(abc).clickAndHold().perform();
}
}
