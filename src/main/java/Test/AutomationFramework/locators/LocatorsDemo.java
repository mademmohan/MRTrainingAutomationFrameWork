package Test.AutomationFramework.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://github.com/login");
		
		driver.findElement(By.id("login_field")).sendKeys("test@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		//driver.findElement(By.linkText("Forgot password?")).click();
		
		//driver.findElement(By.partialLinkText("Forgot")).click();
		
		String headername=driver.findElement(By.tagName("h1")).getText();
		
		System.out.println(headername);
		
		driver.findElement(By.name("commit")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
