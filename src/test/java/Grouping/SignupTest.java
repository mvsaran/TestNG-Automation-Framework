package Grouping;

import org.testng.annotations.Test;

public class SignupTest {
	@Test(priority = 1,
			groups = {"regression"})
	void signupbyEmail() {
		System.out.println("Signup Email Test");
	}
  
	@Test(priority = 2,
			groups = {"regression"})
	void signupbyPhone() {
		System.out.println("Signup Phone Test");
	}
	
	@Test(priority = 3,
			groups = {"regression"})
	void signupbyFacebook() {
		System.out.println("Signup Facebook Test");
	}

}
