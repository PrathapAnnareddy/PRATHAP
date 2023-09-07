package prathapreddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com");
String a=driver.getWindowHandle();
System.out.println(a);
}

}
