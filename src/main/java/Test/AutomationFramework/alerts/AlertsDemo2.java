package Test.AutomationFramework.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemo2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		driver.findElement(By.id("promptBox")).click();
		
		Alert alert=driver.switchTo().alert();
		
		//Thread.sleep(2000);
		
		alert.sendKeys("MR Training");
		
		alert.accept();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
