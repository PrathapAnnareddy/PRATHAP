package Testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertequals {
@Test
public void m1() {
	Reporter.log("hii sir",true);
	String actresult="Hi";
	String expresult="Hi";
	Assert.assertNotEquals(actresult,expresult);
}
}
