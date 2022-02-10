package Test.AutomationFramework.validationsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// isEnabled-- if requied is allows to click then it return true else return
		// false

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://github.com/password_reset");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		WebElement forgotpasswordbutton = driver.findElement(By.xpath("//input[contains(@value,'Send password')]"));

		if (forgotpasswordbutton.isEnabled()) {
			forgotpasswordbutton.click();
			System.out.println("Successfullly clicked on forgotpassword button");
		} else {
			System.out.println("Forgot password button is not enabled");
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
