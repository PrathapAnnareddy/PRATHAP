package prathapreddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		String ap=driver.getTitle();
		System.out.println(ap);
		System.out.println(driver.getTitle());
		
	}

}
