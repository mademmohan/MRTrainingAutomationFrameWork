package Test.AutomationFramework.Testngconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		WebElement fileupload = driver.findElement(By.id("uploadfile"));

		Actions action = new Actions(driver);
		
		action.moveToElement(fileupload).perform();

		String projectlocation = System.getProperty("user.dir");

		fileupload.sendKeys(projectlocation + "\\TestData\\Screen.png");

	}

}
