package Testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Secondproject {
@BeforeClass
public void openbrowser() {
	Reporter.log("open browser",true);
}
@BeforeMethod
public void logintoapp() {
	Reporter.log("login to app",true);
}
@Test(priority = 1)
public void verifymethod() {
	Reporter.log("running verify user id",true);
}
@AfterMethod
public void logouttoapp() {
	Reporter.log("log out app",true);
}
@AfterClass
public void closebrowser() {
	Reporter.log("close browser",true);
}
}
