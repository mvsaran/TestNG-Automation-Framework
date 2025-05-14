package TestNGAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

	
	@Test
	void testTitele() {
		
		String ExpectedTitle =  "Testng Framework";
		String ActualTitle = "Testng Framework";
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
}
