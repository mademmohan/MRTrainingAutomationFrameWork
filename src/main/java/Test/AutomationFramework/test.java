package Test.AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Site Map")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("QEdge")).click();
	}

}
