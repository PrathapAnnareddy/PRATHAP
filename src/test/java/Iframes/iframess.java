package Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframess {
public static void main(String[] args) throws Throwable {
WebDriver driver=new EdgeDriver();
driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
driver.manage().window().maximize();
driver.switchTo().frame(0);
//use 1st frame
 String abc = driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).getText();
 System.out.println(abc);
 
 driver.switchTo().defaultContent();
 driver.switchTo().frame(1);
 Thread.sleep(3000);
String abc1 = driver.findElement(By.xpath("(//a[text()='AbstractFindByBuilder'])")).getText();
System.out.println(abc1);

driver.switchTo().defaultContent();
driver.switchTo().frame(2);
Thread.sleep(3000);
String abc2 = driver.findElement(By.xpath("(//a[text()='org.openqa.selenium.bidi'])[1]")).getText();
System.out.println(abc2);
System.out.println(abc3);
System.out.println(prathap);
}

}
