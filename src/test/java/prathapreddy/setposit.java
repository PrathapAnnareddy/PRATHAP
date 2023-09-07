package prathapreddy;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposit {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com");
Point p=new Point(400,400);
driver.manage().window().setPosition(p);

	}
}
