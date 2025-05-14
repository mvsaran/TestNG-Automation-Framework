package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{

	public void onStart(ITestContext context) {
	    
		System.out.println("Test Execution started: " );
	  }
	
	public void onTestStart(ITestResult result) {
	    
		System.out.println("Test started:");
	  }
	
	public void onTestSuccess(ITestResult result) {
	    
		System.out.println("Test passed:");
	  }
	
	public void onTestFailure(ITestResult result) {
	    
		System.out.println("Test failed:");
	  }
	public void onTestSkipped(ITestResult result) {
	    System.out.println("Test skipped:");
	  }
	
	public void onFinish(ITestContext context) {
	    System.out.println("Test Execution finished:");
	  }

}
