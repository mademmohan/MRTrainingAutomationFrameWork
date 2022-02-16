package com.automationframework.javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemo {

	WebDriver driver;

	@org.testng.annotations.Test(priority = 1)
	public void setUP() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://github.com/login");

	}

	@org.testng.annotations.Test(priority = 2)
	public void login() {

		/*
		 * driver.findElement(By.id("login_field")).sendKeys("guru@gmail.com");
		 * 
		 * driver.findElement(By.id("password")).sendKeys("testing@123");
		 * 
		 * driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		 */

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		// js.executeScript("document.getElementById('login_field').value='guru@gmail.com';");

		// js.executeScript("document.getElementById('password').value='testing@123';");

		// js.executeScript("document.getElementByXpath('//input[@value='Sign
		// in']').click;");

		WebElement usernametxtbox = driver.findElement(By.id("login_field"));

		WebElement passwordtxtbox = driver.findElement(By.id("password"));

		WebElement submit = driver.findElement(By.xpath("//input[@value='Sign in']"));
		
		js.executeScript("arguments[0].value='guru@gmail.com';", usernametxtbox);
		
		js.executeScript("arguments[0].value='Testing@123';", passwordtxtbox);

		js.executeScript("arguments[0].click();", submit);

	}

}
