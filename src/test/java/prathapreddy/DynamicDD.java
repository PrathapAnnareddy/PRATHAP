package prathapreddy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicDD {
private static String text;
private static WebElement oneoption;

public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com");
driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("kgf");
Thread.sleep(3000);
List<WebElement>alloptions= driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
//use for each loop
for(WebElement oneoption:alloptions)
	{
	String text=oneoption.getText();
	System.out.println(text);
	
	if(text.contains("kgf2naasongs")) {
	oneoption.click();
	break;
	}
	}
	}
	}


