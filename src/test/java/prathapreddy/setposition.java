package prathapreddy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class setposition{
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.monsterindia.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		
		}

}
