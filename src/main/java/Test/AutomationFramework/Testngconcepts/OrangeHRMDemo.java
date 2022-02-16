package Test.AutomationFramework.Testngconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMDemo {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		//driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}

	@Test
	public void orangeHRMLogin() {

		WebElement usernametxtbox = driver.findElement(By.id("txtUsername"));

		usernametxtbox.clear();

		usernametxtbox.sendKeys("Admin");

		WebElement passwrdtxtbox = driver.findElement(By.id("txtPassword"));

		passwrdtxtbox.clear();

		passwrdtxtbox.sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();

		String expected = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";

		String actual = driver.getCurrentUrl();

		Assert.assertEquals(actual, expected);

	}

	@AfterMethod
	public void logout() throws InterruptedException {
		driver.findElement(By.id("welcome")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Logout']")).click();

		String expected = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

		String actual = driver.getCurrentUrl();

		Assert.assertEquals(actual, expected);

		driver.close();

	}

}
