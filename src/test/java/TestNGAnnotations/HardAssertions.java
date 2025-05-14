package TestNGAnnotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	void testTitele() {
		
//		String ExpectedTitle =  "Testng Framework";
//		String ActualTitle = "Testng Framework";
		
		Assert.assertEquals("Testing","Testing");
		//Assert.assertNotEquals("Testing","Test");
		
		//Assert.assertTrue(false);//Fail
		//Assert.assertFalse(true);//Fail
		
		//Assert.assertNull(null);//Fail
		//Assert.asserTrue(True);//Pass
		
		//Assert.asserFalse(false);//Pass
		//Assert.asserNotNull("Testing");//Pass
		
		//Assert.asserTrue(1==2);//Fail
		//Assert.asserFalse(1==2);//Pass
		
		//Asser.assertFail(1==2);//Fail
		//Assert.asserFail(1==1);//Pass
		
		//Asser.fail();
		
	}

}
