package Test.AutomationFramework.ashok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/seeker/registration");
		
		driver.manage().window().maximize();
		
	WebElement fileupload=	driver.findElement(By.xpath("//span[.='Choose CV']"));
	
	fileupload.sendKeys("C:\\Users\\gurum\\Desktop\\ashok details\\Automation testing.docx");
	}

}
