package prathapreddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrap2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	driver.manage().window().maximize();
	WebElement abc1=driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
	WebElement abc=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
	Actions act=new Actions(driver);
	act.dragAndDrop(abc, abc1).perform();
}
}
