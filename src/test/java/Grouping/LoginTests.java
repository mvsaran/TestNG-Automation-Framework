package Grouping;

import org.testng.annotations.Test;

public class LoginTests {
	
	@Test(priority = 1,
			groups = {"sanity"})
	void loginbyEmail() {
		System.out.println("Login Email Test");
	}
 
	@Test(priority = 2,
			groups = {"sanity"})
	void loginbyPhone() {
		System.out.println("Login Phone Test");
	}
	
	@Test(priority = 3,
			groups = {"sanity"})
	void loginbyFacebook() {
		System.out.println("Login Facebook Test");
	}
}
