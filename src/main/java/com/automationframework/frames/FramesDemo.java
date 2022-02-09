package com.automationframework.frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		Thread.sleep(5000);
		  
		driver.switchTo().frame("frm1");
		
		WebElement coursedropdown=driver.findElement(By.id("course"));
		
		Select courses= new Select(coursedropdown);
		
		courses.selectByIndex(1);
	}

}
