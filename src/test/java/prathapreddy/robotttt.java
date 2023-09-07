package prathapreddy;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotttt {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	Robot rr=new Robot();
	rr.keyPress(KeyEvent.VK_PAGE_DOWN);
	rr.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(3000);
	rr.keyPress(KeyEvent.VK_PAGE_UP);
	rr.keyRelease(KeyEvent.VK_PAGE_UP);
}
}
