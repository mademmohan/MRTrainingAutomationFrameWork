package Test.AutomationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
driver.get("http://primusbank.qedgetech.com");
		
		driver.findElement(By.linkText("Site Map")).click();
		
		List<WebElement>  links = driver.findElements(By.linkText("Home"));
		System.out.println(links.size());
	}

}
