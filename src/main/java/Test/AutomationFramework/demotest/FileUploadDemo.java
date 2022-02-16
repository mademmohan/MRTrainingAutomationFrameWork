package Test.AutomationFramework.demotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String property=System.getProperty("user.dir");
		System.out.println(property);
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("uploadfile")).sendKeys(property+"\\files\\Screenshot.png");
	}

}
