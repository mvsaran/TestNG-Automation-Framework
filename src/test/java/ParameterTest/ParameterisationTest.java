package ParameterTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParameterisationTest {
	
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void setUp(String browser) throws InterruptedException {
		
		switch (browser)
		{
		case "chrome" : driver =  new ChromeDriver();break;
		case "firefox" : driver =  new FirefoxDriver();break;
		case "edge" : driver =  new EdgeDriver();break;
		default : System.out.println("Invalid browser");return;
		}
		
		
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	void testLogo()
	{
		boolean StatusofLogo = driver.findElement(By.xpath("//div[@class='login_logo']")).isDisplayed();
		Assert.assertEquals(StatusofLogo,true);
		
	}
	@Test(priority = 2)
	void testTitle()
	{
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}
	@Test(priority = 3)
	void testURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/v1/");
	}
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
}
