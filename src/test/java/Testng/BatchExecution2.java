package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class BatchExecution2 {
@Test
public void m4() {
Reporter.log("running tc4",true);
}
@Test
public void m5(){
Reporter.log("running tc5",true);
}
@Test
public void m6() {
Reporter.log("running tc6",true);
}}