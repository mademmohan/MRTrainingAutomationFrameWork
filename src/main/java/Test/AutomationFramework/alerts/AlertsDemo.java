package Test.AutomationFramework.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/delete_customer.php");

		driver.findElement(By.name("cusid")).sendKeys("324751424");

		Thread.sleep(2000);

		driver.findElement(By.name("submit")).click();

		Thread.sleep(2000);

		Alert pagealert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		String textinsidealert = pagealert.getText();
		Thread.sleep(2000);
		System.out.println(textinsidealert);
		Thread.sleep(2000);
		pagealert.dismiss();

		Thread.sleep(2000);

		driver.close();
	}

}
