package Test.AutomationFramework.ashok;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderConcept {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test(dataProvider = "loginData")
	public void login(String usrname, String password) throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys(usrname);

		driver.findElement(By.id("txtPassword")).sendKeys(password);

		driver.findElement(By.id("btnLogin")).click();

		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed(), "Failed due to not available of welcome");

		Thread.sleep(5000);

		driver.close();

	}

	@DataProvider(parallel= true)
	public Object[][] loginData() {

		Object[][] data = new Object[4][2];

		data[0][0] = "Admin";
		data[0][1] = "admin123";

		data[1][0] = "Admin";
		data[1][1] = "admin123";
		
		data[2][0] = "Admin";
		data[2][1] = "admin123";

		data[3][0] = "Admin";
		data[3][1] = "admin123";

		return data;

	}

}
