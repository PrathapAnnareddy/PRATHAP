package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class Enabledcases {
@Test(enabled = false)
public void testing() {
Reporter.log("testing sir",true);
}
@Test(enabled = false)
public void sir() {
	Reporter.log("you are really good",true);
}
@Test
public void truth() {
	Reporter.log("its truth",true);
}
}
