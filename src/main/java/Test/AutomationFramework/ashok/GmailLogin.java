package Test.AutomationFramework.ashok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.manage().window().maximize();
		WebElement clear=driver.findElement(By.xpath("//input[@type='email']"));
		clear.sendKeys("veeraashok2@gmail.com");
		//clear.clear();
		
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("veeraprathap");
		driver.findElement(By.xpath("//span[.='Next']")).click();
	}

}
