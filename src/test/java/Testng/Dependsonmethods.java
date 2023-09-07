package Testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethods {
@Test
public void login() {
	Reporter.log("i am login",true);
	Assert.fail();
}
@Test(alwaysRun = true)
public void logout() {
	Reporter.log("i am logout",true);
}
@Test(dependsOnMethods = {"login"})
public void m3(){
Reporter.log("i am m3",true);
}}
