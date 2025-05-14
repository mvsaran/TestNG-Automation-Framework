package TestNGAnnotations;


import org.testng.annotations.*;

//Annotations are used to define the order of execution of test methods and setup/teardown methods in TestNG.
// TestNG order of execution is as follows:
// 1. @BeforeSuite
// 2. @BeforeTest
// 3. @BeforeClass
// 4. @BeforeMethod
// 5. @Test
// 6. @AfterMethod
// 7. @AfterClass
// 8. @AfterTest
// 9. @AfterSuite
// 10. @BeforeGroups
// 11. @AfterGroups

public class AllAnnotations {
	
	@BeforeSuite
	void BS() {
		System.out.println("Before Suite");
		
		}
	
	@AfterSuite
	void AS() {
		System.out.println("After Suite");
	}
	
	@BeforeTest
	void BT() {
		System.out.println("Before Test");
	}
	@AfterTest
	void AT() {
		System.out.println("After Test");
	}
	@BeforeClass
	void BC() {
		System.out.println("Before Class");
	}
	@AfterClass
	void AC() {
		System.out.println("After Class");
	}
	@BeforeMethod
	void BM() {
		System.out.println("Before Method");
	}
	@AfterMethod
	void AM() {
		System.out.println("After Method");
	}
	@Test(priority = 1)
	void test1() {
		System.out.println("Test 1");
	}
	@Test(priority = 2)
	void test2() {
		System.out.println("Test 2");
	}
	
	

}
