package Test.AutomationFramework.validationsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationsDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://courses.letskodeit.com/practice");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		WebElement bmwradio = driver.findElement(By.id("bmwradio"));

		// bmwradio.click();//status clicked True

		if (bmwradio.isSelected()) { // true
			System.out.println("BMW already seleted");
		} else {
			bmwradio.click();
			System.out.println("Now successfully clicked on BMW radio button");
		}
		
		  //[OR] Both are same

		if (!bmwradio.isSelected()) {// If not selected return true 
			bmwradio.click();
			System.out.println("Successfully clicked on radio button");
		} else {
			System.out.println("BMW radio button is already selected");
		}

	}
}
