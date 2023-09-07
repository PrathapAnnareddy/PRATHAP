package prathapreddy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class scrollup {
public static void main(String[] args) throws Throwable {
WebDriver driver=new EdgeDriver();
driver.get("https://www.amazon.in");
Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,2000)");
Thread.sleep(3000);
jse.executeScript("window.scrollBy(0,-2000)");

}
}
