package prathapreddy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot1 {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));	
	Robot rp=new Robot();
	rp.keyPress(KeyEvent.VK_CONTROL);
	rp.keyPress(KeyEvent.VK_V);
	Thread.sleep(3000);
	rp.keyRelease(KeyEvent.VK_V);
	Thread.sleep(3000);

	rp.keyRelease(KeyEvent.VK_CONTROL);

	Thread.sleep(3000);
	rp.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(3000);

	rp.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	

	}

}
