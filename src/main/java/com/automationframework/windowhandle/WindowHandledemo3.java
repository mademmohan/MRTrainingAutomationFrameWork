package com.automationframework.windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandledemo3 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swtestacademy.com/category/performance-testing/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("menu-item-11512")).click();
		Set<String> allwindows = driver.getWindowHandles();
		
	
		for(String win:allwindows)
		{
		driver.switchTo().window(win);
		if(driver.getCurrentUrl().equalsIgnoreCase("https://jooble.org/jobs-software-tester"));
		
		driver.findElement(By.xpath("//div[.='_4d0ae _8cc90']")).click();
		driver.findElement(By.id("input_124236")).clear();
		driver.findElement(By.id("input_124236")).sendKeys("qa testing");
		driver.findElement(By.id("tbRegion")).sendKeys("United Kingdom");
		
		driver.findElement(By.xpath("//button[.='_3c619 d591c _37900 aa38d']")).click();
		
		}
		}
		
		
		
	

}
