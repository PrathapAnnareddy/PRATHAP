package Testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertfail {
@Test
public void tc1() {
	Reporter.log("execute tc1",true);
	Assert.fail();
}
@Test
public void tc2() {
	Reporter.log("executing tc2",true);
	Assert.fail();
}
@Test
public void tc3() {
	Reporter.log("executing tc3",true);

}
}
