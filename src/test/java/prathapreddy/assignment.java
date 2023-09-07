package prathapreddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(3000);
	WebElement abc= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	driver.navigate().refresh();
	abc.sendKeys("mobile under 20000");
}
}
