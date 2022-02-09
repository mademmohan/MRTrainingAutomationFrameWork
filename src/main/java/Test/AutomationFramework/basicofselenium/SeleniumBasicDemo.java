package Test.AutomationFramework.basicofselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasicDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		WebElement textbox=driver.findElement(By.id("name"));
		
		textbox.sendKeys("MR Training");
		
		Thread.sleep(2000);
		
		textbox.clear();
		
		Thread.sleep(3000);
		
		textbox.sendKeys("Morning Batch");
		
		
		Thread.sleep(2000);
		
		driver.close();
	}
	
}
