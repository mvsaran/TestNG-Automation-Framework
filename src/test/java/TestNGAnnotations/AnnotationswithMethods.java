package TestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * TestNG AnnotationswithMethods
 * AnnotationswithMethods are used to provide metadata information about the test methods
 * 1.Login ---> @BeforeMethod
 * 2.Logout ---> @AfterMethod
 * 3.Search ---> @Test
 * 4. Advanced Search ---> @Test
 * 
 * 
 */
public class AnnotationswithMethods {
	
	@BeforeMethod
	void login() {
		System.out.println("Login");
	}
	@Test(priority = 1)
	void Search() {
		System.out.println("Search");
	}
	@Test(priority = 2)
	void AdvancedSearch() {
		System.out.println("Advanced Search");
	}
	@AfterMethod
	void logout() {
		System.out.println("Logout");
	}
	

}
