package Test.AutomationFramework.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Thread.sleep(5000);

		Actions action = new Actions(driver);

		action.sendKeys(Keys.ENTER).perform();
		
		String enteredtext=driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(enteredtext);
	}

}
