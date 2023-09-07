package prathapreddy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotkeys {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https.//www.flipkart.com");
	driver.findElement(By.xpath("//button[test()='x']")).click();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_PAGE_UP);
	r.keyRelease(KeyEvent.VK_PAGE_UP);
	
}
}
