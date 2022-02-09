package Test.AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("MR Training Institute in Hydearbad");
		
	}

}
