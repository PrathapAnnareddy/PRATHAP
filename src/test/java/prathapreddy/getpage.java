package prathapreddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		String obj=driver.getPageSource();
		System.out.println(obj);
	}
}
