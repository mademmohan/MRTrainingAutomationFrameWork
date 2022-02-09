package Test.AutomationFramework.syncronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitywaitDemo {

	 public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		 
		// Thread.sleep(3000);
		 
		 driver.findElement(By.name("firstname")).sendKeys("Ram");
		 
		 driver.findElement(By.name("lastname")).sendKeys("Kallathuri");
		 
		 driver.findElement(By.name("reg_email__")).sendKeys("ramkallaturi@gmail.com");
		 
		 driver.findElement(By.id("password_step_input")).sendKeys("testing@123");
		 
		 WebElement day=driver.findElement(By.id("day"));
		 
		 Thread.sleep(3000);
		 Select dayselection= new Select(day);
		 
		 dayselection.selectByVisibleText("25");
		 
		 Thread.sleep(3000);
		 WebElement month=driver.findElement(By.id("month"));
		 
		 Select monthselection= new Select(month);
		 
		 monthselection.selectByVisibleText("Oct");
		 
		 Thread.sleep(3000);
		 WebElement year=driver.findElement(By.id("year"));
		 
		 Select yearselection= new Select(year);
		 
		 yearselection.selectByVisibleText("2021");
		 
		 
	}
}
