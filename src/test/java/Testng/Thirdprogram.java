package Testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Thirdprogram {
@Test
public void method1() {
	Reporter.log("hiiii man",true);
}
@Test
public void login() {
	Reporter.log("how are you sir",true);
}
@Test
public void logo() {
	Reporter.log("who r u",true);
}
@Test
public void logout() {
	Reporter.log("im fine",true);
}
}
