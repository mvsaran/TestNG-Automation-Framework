package DependencyMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {

	@Test(priority = 1)
	void openApplication() {
		Assert.assertTrue(true);
		
	}
	
	@Test(priority =  2, dependsOnMethods = { "openApplication"})
	void login() {
		Assert.assertTrue(true);
				
	}
	@Test(priority = 3, dependsOnMethods = { "login"})
	void Search() {
		
		Assert.assertTrue(true);
	}
	
	@Test(priority = 4, dependsOnMethods = { "login"})
	void AdvancedSearch() {
		Assert.assertTrue(false);
	}
	@Test(priority = 5,dependsOnMethods = { "Search", "AdvancedSearch"})
	void logout() {
		Assert.assertTrue(true);
	}
}

