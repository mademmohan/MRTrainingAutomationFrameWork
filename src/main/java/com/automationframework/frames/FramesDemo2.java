package com.automationframework.frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		 
		 driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		 
		 Thread.sleep(2000);
		 
		 WebElement textboxarea=driver.findElement(By.className("frmTextBox"));
		 
		 textboxarea.sendKeys("MR Training");
		 
		 Thread.sleep(2000);
		 
		 WebElement frame1=driver.findElement(By.id("frm1"));
		 
		 driver.switchTo().frame(frame1);
		 
		 WebElement menuinframe1=driver.findElement(By.id("selectnav2"));
		 
		 Select menu= new Select(menuinframe1);
		 
		 menu.selectByVisibleText("Home");
		 
		 Thread.sleep(2000);
		 
		 driver.switchTo().defaultContent();
		 
		 textboxarea.clear();
		 
		 Thread.sleep(2000);
		 
		 textboxarea.sendKeys("Morning9AM Batch");
		 
		 Thread.sleep(2000);
		 
		 driver.close();
		 
	}

}
