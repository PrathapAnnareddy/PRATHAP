package prathapreddy;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Robotkey {
public static void main(String[] args) throws Throwable {
WebDriver driver=new EdgeDriver();
driver.get("https://www.amazon.in");
Thread.sleep(3000);
Robot r=new Robot();
r.keyPress(KeyEvent.VK_PAGE_DOWN);
r.keyRelease(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_PAGE_UP);
r.keyRelease(KeyEvent.VK_PAGE_UP);
}
}
