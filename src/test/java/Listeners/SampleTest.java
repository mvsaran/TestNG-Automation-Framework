package Listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

//@Listeners(MyListener.class)
public class SampleTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp() throws InterruptedException
	{
		driver =  new ChromeDriver();
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
		Assert.assertEquals(driver.getTitle(), "Swag ");
	}
	@Test(priority = 3,dependsOnMethods = {"testTitle"})
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
