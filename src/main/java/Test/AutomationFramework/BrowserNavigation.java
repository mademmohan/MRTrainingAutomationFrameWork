package Test.AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNavigation {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();//Syntax to maximize particular screen
		
		//driver.get("https://google.co.in");
		
		
		
		
		
	//driver.findElement(By.linkText("Gmail")).click();
	
	//If you use get method method it won't go backword direction, It won't contain history
		
		driver.navigate().to("https://google.co.in");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Gmail")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();//google page
		
		Thread.sleep(2000);
		
		driver.navigate().forward();//gmail page
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		
		
		
	
		
		
	}

}
