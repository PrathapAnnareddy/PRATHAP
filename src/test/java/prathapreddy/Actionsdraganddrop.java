package prathapreddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdraganddrop {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	driver.manage().window().maximize();
	WebElement abc=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
	WebElement abc1=driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
	Actions act=new Actions(driver);
	act.dragAndDrop(abc, abc1).perform();
	}
}
