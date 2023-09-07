package prathapreddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alertpopup {
public static void main(String args[]) throws Throwable {
WebDriver driver=new EdgeDriver();
driver.get("https://demo.guru99.com/test/delete_customer.php");
driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234567");
driver.findElement(By.xpath("//input[@name='submit']")).click();
driver.switchTo().alert().accept();
driver.switchTo().alert().dismiss();
String text=driver.switchTo().alert().getText();
System.out.println(text);
}
}
