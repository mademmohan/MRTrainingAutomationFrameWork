package Test.AutomationFramework.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownDemo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		
		//WebElement counry=driver.findElement(By.name("country"));
		
		Select countryselect = new Select(driver.findElement(By.name("country")));
		countryselect.selectByVisibleText("BANGLADESH");

		WebElement selectedcountry = countryselect.getFirstSelectedOption();

		System.out.println(selectedcountry.getText());
	}

}
