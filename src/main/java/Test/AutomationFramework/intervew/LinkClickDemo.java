package Test.AutomationFramework.intervew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkClickDemo {
	
	public void googleLinkClick(String clickablelink) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://google.com");

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));

		for (WebElement link : alllinks) {// It is used to iterate all the links of the page
			
			System.out.println("Expected link::"+clickablelink);
			String googlepagelinks = link.getText();
			
			System.out.println("Actual link::"+googlepagelinks);

			if (googlepagelinks.equalsIgnoreCase(clickablelink)) {
				link.click();
				break;
			}
		}

		/*
		 * WebElement gmaillink=driver.findElement(By.linkText("About"));
		 * 
		 * gmaillink.click();
		 */

		
	}
	

	public static void main(String[] args) throws InterruptedException {
		LinkClickDemo ref= new LinkClickDemo();
		
		ref.googleLinkClick("Advertising");
	}	

}
