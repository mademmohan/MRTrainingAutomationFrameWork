package Test.AutomationFramework.intervew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsDemo {
	
	//We will code or logic either in a method or in main method
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		//Instance of driver
		
		WebDriver driver= new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");// This will open 
		// a paricular url of the applicaiton
		
		Thread.sleep(2000);  //2000 milli seconds 2 seconds it will halt execution control
		
		driver.manage().window().maximize();// It will maximize a particular screen
		
		Thread.sleep(2000);
		
		WebElement usernametextbox=driver.findElement(By.id("txtUsername"));
		
		usernametextbox.sendKeys("Admin");
		
		Thread.sleep(2000);
		
		 WebElement passwordtextbox=driver.findElement(By.name("txtPassword"));
		 
		 passwordtextbox.sendKeys("admin123");
		 
		 Thread.sleep(2000);
		 
		 WebElement loginbutton=driver.findElement(By.id("btnLogin"));
		 
		 loginbutton.click();
		 
		 String expected="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		String actual=driver.getCurrentUrl();
		 
		 //Flow control statement
		
		System.out.println("My expected url is::"+expected);
		
		if(actual.equals(expected)) {  //boolean true / false
			System.out.println("peter logged in successfully");
		}
		else
		{
			System.out.println("Peter failed to login............!");
		}
		 
		 
		 Thread.sleep(2000);
		 
		 driver.close();
		 
		 
		 
		 
		 
		 
		
		
		
	}

}
