package Test.AutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUpClass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//div/a[.='Gmail']")).click();
	}

}
