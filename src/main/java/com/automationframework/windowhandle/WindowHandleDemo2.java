package com.automationframework.windowhandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleDemo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		String parentwindow = driver.getWindowHandle();

		driver.findElement(By.id("newWindowBtn")).click();

		Set<String> allwindows = driver.getWindowHandles();

		// how to for each or for loop

		for (String window : allwindows) {
			driver.switchTo().window(window);
			if (driver.getCurrentUrl().equalsIgnoreCase("https://www.hyrtutorials.com/p/basic-controls.html")) {
				driver.manage().window().maximize();
				
				driver.findElement(By.id("firstName")).sendKeys("MR Training");
				break;
			}
		}
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
