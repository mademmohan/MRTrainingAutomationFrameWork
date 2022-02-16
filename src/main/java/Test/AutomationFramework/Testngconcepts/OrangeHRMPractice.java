package Test.AutomationFramework.Testngconcepts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMPractice {

	WebDriver driver;

	Properties pr;

	@BeforeSuite // this will execute first in testNG
	public void loadData() throws IOException {
		// How to get project location

		String projectlocation = System.getProperty("user.dir");

		System.out.println("Project location is::" + projectlocation);

		File fi = new File(projectlocation + "\\TestData\\credentials.properties");

		// To read the data java bufferreader class

		BufferedReader reader = new BufferedReader(new FileReader(fi));

		// to read data from properies file user properties class in java

		pr = new Properties();

		pr.load(reader);
	}

	@BeforeTest
	public void setUP() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		String url = pr.getProperty("URL");
		
		System.out.println(url);
		
		driver.get(url);

	}

	@Test
	public void orangeHRMLogin() {

		WebElement usernametxtbox = driver.findElement(By.id("txtUsername"));

		usernametxtbox.clear();

		usernametxtbox.sendKeys(pr.getProperty("UserName"));

		WebElement passwrdtxtbox = driver.findElement(By.id("txtPassword"));

		passwrdtxtbox.clear();

		passwrdtxtbox.sendKeys(pr.getProperty("Password"));

		driver.findElement(By.id("btnLogin")).click();

		String expected = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";

		String actual = driver.getCurrentUrl();

		Assert.assertEquals(actual, expected);
	}

	@Test
	public void searchLocation() throws InterruptedException {

		Thread.sleep(3000);

		Actions action = new Actions(driver);

		WebElement admin = driver.findElement(By.xpath("//b[.='Admin']"));

		WebElement organization = driver.findElement(By.id("menu_admin_Organization"));

		WebElement locations = driver.findElement(By.id("menu_admin_viewLocations"));

		action.moveToElement(admin).moveToElement(organization).moveToElement(locations).click().perform();

		String expected = "https://opensource-demo.orangehrmlive.com/index.php/admin/viewLocations";

		String actual = driver.getCurrentUrl();

		SoftAssert softasert = new SoftAssert();

		softasert.assertEquals(expected, actual);

		driver.findElement(By.id("searchLocation_name")).sendKeys(pr.getProperty("Location"));

		driver.findElement(By.id("btnSearch")).click();

		softasert.assertAll();
	}

	@AfterTest
	public void tear_Down() throws InterruptedException {

		driver.findElement(By.id("welcome")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[.='Logout']")).click();

		Thread.sleep(2000);

		String expected = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

		String actual = driver.getCurrentUrl();

		Assert.assertEquals(expected, actual);

		Thread.sleep(2000);

		driver.close();
	}

}
