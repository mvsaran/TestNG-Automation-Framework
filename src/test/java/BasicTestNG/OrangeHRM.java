package BasicTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*
 * 1.Open Application
 * 2.Test Logo
 * 3.Login
 * 4.Logout
 */
 
public class OrangeHRM {
	WebDriver driver;
 
	@Test(priority = 1)
	void openApplication() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test(priority = 2)
	void testLogo() throws InterruptedException {
		Thread.sleep(2000);
		boolean Status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo is displayed : " + Status);
	}
	@Test(priority = 3)
	void login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test(priority = 4)
	void logout() {
		driver.close();
		
	}
	
}
