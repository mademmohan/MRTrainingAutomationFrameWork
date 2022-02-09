package Test.AutomationFramework.syncronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTimeOutDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(-10, TimeUnit.SECONDS);

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		System.out.println(driver.getTitle());
	}

}
