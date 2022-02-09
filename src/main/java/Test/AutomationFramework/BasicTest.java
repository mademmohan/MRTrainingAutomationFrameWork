package Test.AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();// This will control your machine and check which version
		//he is using and in run time it download the required one
		
		Thread.sleep(3000);
		WebDriver driver= new ChromeDriver();// To initialze chrome
		Thread.sleep(3000);
		
		driver.manage().window().maximize();// maximize and then open url
		Thread.sleep(3000);
		
		driver.get("https://github.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/a[@data-ga-click='(Logged out) Header, clicked Sign in, text:sign-in']")).click();
		
		driver.findElement(By.id("login_field")).sendKeys("gurureddy@gmail.com");
	}

}
