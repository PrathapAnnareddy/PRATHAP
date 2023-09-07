package prathapreddy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollhandling {
public static void main(String args[]) throws Throwable {

WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in");
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,2000)");
Thread.sleep(5000);
jse.executeScript("window.scrollBy(0,-1000)");

}
}