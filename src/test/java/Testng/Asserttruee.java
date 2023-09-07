package Testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Asserttruee {
@Test(priority = 0)
public void tc1() {
	Reporter.log("running tc3",true);
}
@Test(priority = 1)
public void  tc3() {
	Reporter.log("hloo",true);
}
@Test(priority = 0)
public void tc2() {
	Reporter.log("running tc2",true);
	Assert.fail();
}
@Test()
public void m4() {
	Reporter.log("hiii",true);
}
}
