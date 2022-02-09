package Test.AutomationFramework.intervew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsDemoSession {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		//initiate the driver
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		
		WebElement linkpage=driver.findElement(By.tagName("a"));
		        String text=linkpage.getText();
		        System.out.println("First link of the page is::"+text);
		
		List<WebElement> linksofPage=driver.findElements(By.tagName("a"));
		
		for(WebElement link:linksofPage) {
			  String pagelinks=link.getText();
			  System.out.println("Links in Google Page is::"+pagelinks);
			 
		}
		
		
	}

}
