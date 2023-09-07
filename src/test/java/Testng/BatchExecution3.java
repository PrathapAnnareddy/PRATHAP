package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BatchExecution3 {
@Test
public void m7() {
Reporter.log("running tc7",true);
}
@Test
public void m8() {
Reporter.log("running tc8",true);
}
@Test
public void m9() {
Reporter.log("running tc9",true);
}}