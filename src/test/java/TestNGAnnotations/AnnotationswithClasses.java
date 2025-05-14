package TestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationswithClasses {

	@BeforeClass
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
	@AfterClass
	void logout() {
		System.out.println("Logout");
	

	}
}

