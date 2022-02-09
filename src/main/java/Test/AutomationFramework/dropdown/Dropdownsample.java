package Test.AutomationFramework.dropdown;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownsample {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://google.com");
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		File shot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Desti= new File("C:\\Users\\gurum\\Desktop\\Morning batch-3\\sample.png");
		
		FileUtils.copyFile(shot, Desti);
		
		Thread.sleep(2000);
		
		driver.close();
	}	

		
		
	}


