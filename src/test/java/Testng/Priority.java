package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority = 3)
public void hiii() {
	Reporter.log("Hii ankush sir",true);
}
@Test(priority = 1)
public void hloo() {
	Reporter.log("you are the best faculty us",true);
}
@Test(priority = 2)
public void yes() {
	Reporter.log("your classes are really interesting",true);
}
}
