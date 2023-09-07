package Testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
@BeforeSuite
public void m1() {
	Reporter.log("---connect to database",true);
}
@BeforeClass
public void m2() {
	Reporter.log("---open browser",true);
}
@BeforeMethod
public void m3() {
	Reporter.log("---login application",true);
}
@BeforeTest
public void m4() {
	Reporter.log("---execute before every test runner",true);
}
@Test
public void t1() {
	Reporter.log("--boss i am main tc",true);
}
@AfterTest
public void m5() {
	Reporter.log("---execute after every testrunner",true);
}
@AfterMethod
public void m6() {
	Reporter.log("--logout application",true);
}
@AfterClass
public void m7() {
	Reporter.log("--close browser",true);
}
@AfterSuite
public void m8() {
	Reporter.log("---disconnect to database",true);
}
}

