package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouptestng {
@Test(groups = {"group A"})
public void m1() {
	Reporter.log("i belong to group A",true);
}
@Test(groups = {"group A","group B"})
public void m2() {
	Reporter.log("i belong to group A and group B",true);
}
@Test(groups = {"group B"})
public void m3() {
	Reporter.log("i belong to group B",true);
}
}
