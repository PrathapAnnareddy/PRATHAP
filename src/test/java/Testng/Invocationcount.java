package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocationcount {
@Test(invocationCount = 1)
public void tc1(){
	Reporter.log("execute tc1",true);
}
@Test
public void tc2() {
	Reporter.log("execute tc2",true);
}
@Test(invocationCount = 3)
public void tc3() {
	Reporter.log("executing tc3",true);
	
}
}
