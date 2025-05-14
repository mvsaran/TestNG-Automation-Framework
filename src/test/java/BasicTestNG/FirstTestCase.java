package BasicTestNG;

import org.testng.annotations.Test;

//TestNG Executes the test methods in alphabetical order by default
//If you want to execute the test methods in a specific order, you can use the priority attribute of the @Test annotation EXAMPLE @`Test(priority = 1)
// irrespective of the alphabetical order testng will execute the test methods in the order of priority
// if there are two test methods with the same priority, then testng will execute the test methods in alphabetical order
// if you want to execute the test methods in reverse order, you can use the priority attribute of the @Test annotation EXAMPLE @`Test(priority = -1)
// if there is no priority for any test method then the default priority is 0
// Negative priority will be executed first and then positive priority will be executed
// TestNg Exceutes the test methods only the methods are annotated with @Test
// Normal Testing ---->TestSuite --->Testcases --->Test Steps in TestNG XML File --->Classes --->TestMethods

public class FirstTestCase

{
	@Test(priority = 3)
	void logout() {
		System.out.println("Logout");
	}
	@Test(priority = 1)
	void openApplication() {
		System.out.println("Open Application");
	}
	@Test(priority = 2)
	void login() {
		System.out.println("Login");
	}
	

}
