package Test.AutomationFramework.intervew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	public static void findMissingNumber(int[]a) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		for(WebElement eachlink:alllinks) {
			System.out.println(eachlink.getText());
		}
		
	}
	
	public static void main(String[] args) {
	 findMissingNumber(null);
		
	}

}
