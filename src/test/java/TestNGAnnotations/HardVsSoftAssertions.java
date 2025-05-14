package TestNGAnnotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
	// Hard Assertions
	// Hard assertions are used to stop the execution of the test case when the assertion fails.
	// If a hard assertion fails, the test case will be marked as failed and the execution will stop.
	// Hard assertions are used to verify the expected results of a test case.
	
	// Soft Assertions
	// Soft assertions are used to continue the execution of the test case even if the assertion fails.
	// If a soft assertion fails, the test case will be marked as passed but the failed assertion will be reported in the test report.
	// Soft assertions are used to verify the expected results of a test case without stopping the execution of the test case.
	
	@Test
	void testTitele() {
		
		String ExpectedTitle =  "Testng Framework";
		String ActualTitle = "Testng Framew";
		
		// Hard Assertion
		//Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		// Soft Assertion
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Soft Assertion Executed");
		// Soft Assertion
		softAssert.assertAll();
		
		System.out.println("Test Case Executed");
		
	}

}
