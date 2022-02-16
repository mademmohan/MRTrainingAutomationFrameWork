package com.automationframework.javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo2 {
	
	WebDriver driver;
	
	@org.testng.annotations.Test(priority = 1)
	public void setUP() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://www.tutorialspoint.com/index.htm");

	}
	
	@Test(priority = 2)
	public void scrollMethod() {
		
		WebElement AboutUS=driver.findElement(By.xpath("//h3[.='About Us']"));
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].scrollIntoView();", AboutUS);
		
	}

}
