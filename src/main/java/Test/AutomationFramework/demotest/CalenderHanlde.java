package Test.AutomationFramework.demotest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHanlde {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String property=System.getProperty("user.dir");
		System.out.println(property);

		/*
		 * driver.get("http://flights.qedgetech.com");
		 * driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		 * driver.findElement(By.name("password")).sendKeys("demo");
		 * driver.findElement(By.xpath("//button[@type='submit']")).click();
		 * 
		 * driver.findElement(By.xpath("//*[@placeholder='Select Date']")).click();
		 * 
		 * String DOJournery = "18#October#2026"; String[] journey =
		 * DOJournery.split("#"); String date = journey[0]; String month = journey[1];
		 * String year = journey[2];
		 * 
		 * System.out.println("Year is ::" + year); System.out.println("Month is ::" +
		 * month); System.out.println("Day is ::" + date);
		 * 
		 * String calyear; calyear =
		 * driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[2]")).
		 * getText(); System.out.println("Cal year is::" + calyear);
		 * 
		 * while (!year.equalsIgnoreCase(calyear)) { driver.findElement(By.xpath(
		 * "//div[@class='ui-datepicker-title']/..//span[.='Next']")).click(); calyear =
		 * driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[2]")).
		 * getText();
		 * 
		 * }
		 * 
		 * String calmonth; calmonth =
		 * driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[2]")).
		 * getText();
		 * 
		 * while (!month.equalsIgnoreCase(calmonth)) { driver.findElement(By.xpath(
		 * "//div[@class='ui-datepicker-title']/..//span[.='Next']")).click(); calmonth
		 * =
		 * driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[1]")).
		 * getText();
		 * 
		 * }
		 * 
		 * // String caldate;
		 * 
		 * List<WebElement> caldate =
		 * driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		 * 
		 * for(WebElement cal:caldate) if(cal.getText().equalsIgnoreCase(date)) {
		 * cal.click(); break; }
		 */

		// if()

	}

}
