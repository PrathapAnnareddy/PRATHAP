package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BatchExecution {
@Test
public void m1() {
	Reporter.log("running tc1",true);
}
@Test
public void m2() {
	Reporter.log("running tc2",true);
}
@Test
public void m3() {
	Reporter.log("running tc3",true);
}
}
