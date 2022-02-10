package Test.AutomationFramework.validationsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationisEnabledDemo2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		WebElement createnewAccount = driver.findElement(By.xpath("//a[.='Create New Account']"));

		if (createnewAccount.isEnabled()) {
			createnewAccount.click();
			System.out.println("Successfullly clicked on create New Accont button");
		} else {
			System.out.println("Create new Account button is not enabled");
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
