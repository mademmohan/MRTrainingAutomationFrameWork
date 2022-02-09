package Test.AutomationFramework.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionsDemo1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		// Inititalize the driver

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(2000);

		WebElement usernametxtarea = driver.findElement(By.id("txtUsername"));

		usernametxtarea.clear();
		
		Thread.sleep(2000);
		usernametxtarea.sendKeys("Admin");
		

		WebElement passwordtxtarea = driver.findElement(By.id("txtPassword"));

		passwordtxtarea.clear();
		Thread.sleep(2000);

		passwordtxtarea.sendKeys("admin123");
	

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String expectedURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";

		String actualURL = driver.getCurrentUrl();

		if (expectedURL.equals(actualURL)) {
			System.out.println("Kritik Successfully logged into application");
			Actions action = new Actions(driver);

			action.moveToElement(driver.findElement(By.xpath("//b[text()='Admin']")))
					.moveToElement(driver.findElement(By.xpath("//a[text()='Organization']")))
					.moveToElement(driver.findElement(By.xpath("//a[.='Locations']"))).click().perform();
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("searchLocation_name")).sendKeys("Hyderabad");
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("btnSearch")).click();
			
			System.out.println("Kritik successfully searched for Hydearabad location");

		} else {
			System.out.println("Kritik failed to login into the application");
		}

		Thread.sleep(3000);

		//driver.close();

	}

}
