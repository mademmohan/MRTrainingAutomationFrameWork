package Test.AutomationFramework.validationsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateisDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://courses.letskodeit.com/practice");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		WebElement headerofpage = driver.findElement(By.xpath("//h1[contains(text(),'Practice')]"));

		if (headerofpage.isDisplayed()) {
			String headertext = headerofpage.getText();
			System.out.println("Displayed text is ::" + headertext);
		} else {
			System.out.println("Unable get text from header due to unavailable");
		}
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
