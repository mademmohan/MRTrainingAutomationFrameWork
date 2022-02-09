package Test.AutomationFramework.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDropdownDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		//maximize
		driver.manage().window().maximize();
		
		  WebElement ides=driver.findElement(By.id("ide"));
		  
		  Select ideNames= new Select(ides);
		  
		   Thread.sleep(2000);
		  ideNames.selectByValue("ij");
		  
		  Thread.sleep(2000);
		  ideNames.selectByVisibleText("Visual Studio");
		  
		  
		  Thread.sleep(2000);
		  ideNames.selectByIndex(3);
		  
		  Thread.sleep(2000);
		  ideNames.deselectByValue("vs");
		  
		  Thread.sleep(2000);
		  //This will deselect all selected options from multidropdown
		  ideNames.deselectAll();
		  
		  Thread.sleep(3000);
		  driver.close();
	}

}
