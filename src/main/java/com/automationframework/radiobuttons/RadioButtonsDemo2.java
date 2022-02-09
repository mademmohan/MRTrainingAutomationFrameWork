package com.automationframework.radiobuttons;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonsDemo2 {

	public void screenShotDemo(WebDriver driver, String imageName) throws IOException {
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\gurum\\Desktop\\Morning batch-3\\"+imageName+".png");

		FileUtils.copyFile(f, destination);

	}

	public void radiobutton(String cartype) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://courses.letskodeit.com/practice");

		List<WebElement> typesofcars = driver.findElements(By.xpath("//div[@id='radio-btn-example']//label/input"));

		for (WebElement cars : typesofcars) {
			System.out.println(cars.getAttribute("id"));
			if (cars.getAttribute("id").equalsIgnoreCase(cartype)) {
				cars.click();
				break;

			}

		}
		screenShotDemo(driver, "GoogleHomePage");

		Thread.sleep(2000);

		driver.close();

	}
	
	public void demoScreen() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://google.com");
		
		screenShotDemo(driver, "GoogleHomePage");
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		RadioButtonsDemo2 demo = new RadioButtonsDemo2();

		//demo.radiobutton("hondaradio");
		
		demo.demoScreen();
	}

}
