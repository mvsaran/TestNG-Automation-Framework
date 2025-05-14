package DataProviders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProvider {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider = "loginData")
	void testLogin(String username, String password) throws InterruptedException
	{
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.clear();
		userName.sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
	     Thread.sleep(2000);
		
	     boolean logoStatus = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
	     if(logoStatus == true)
	     {
	    	 Assert.assertTrue(true);
	    	 System.out.println("Logo is displayed");
	     }
	     else
	     {
	    	 Assert.fail();
	    	 System.out.println("Logo is not displayed");
	     }

	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}
	
	@org.testng.annotations.DataProvider(name = "loginData",indices = {0,1,2})
	Object[][] loginData()
	{
		Object[][] data = {
					{"standard_user","secret_sauce"},
					{"locked_out_user","secret_sauce"},
					{"problem_user","secret_sauce"},
					{"performance_glitch_user","secret_sauce"}
				
				
		};
		return data;
		
	}
}
