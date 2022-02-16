package Test.AutomationFramework.Testngconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMDataProvider {

	WebDriver driver;

	

	@Test(dataProvider = "loginData")
	public void orangeHrmLogin(String username, String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		WebElement usernametxtbox = driver.findElement(By.id("txtUsername"));

		usernametxtbox.clear();

		usernametxtbox.sendKeys(username);

		WebElement passwordtxtbox = driver.findElement(By.id("txtPassword"));

		passwordtxtbox.clear();

		passwordtxtbox.sendKeys(password);

		driver.findElement(By.id("btnLogin")).click();

		//boolean stment = driver.findElement(By.id("welcome")).isDisplayed();

		String expted = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";

		String actual = driver.getCurrentUrl();
		
		SoftAssert soft= new SoftAssert();

		soft.assertEquals(actual, expted);
		
		//soft.assertTrue(driver.findElement(By.id("welcome")).isDisplayed(), "Invalid login into applicaiton");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		soft.assertAll();

	}

	@DataProvider(parallel = true)
	public Object[][] loginData() {

		Object[][] data = new Object[3][2];

		data[0][0] = "Admin";
		data[0][1] = "admin123";

		data[1][0] = "Admin";
		data[1][1] = "test123";
		
		data[2][0] = "Admin";
		data[2][1] = "admin123";

		return data;

	}

}
