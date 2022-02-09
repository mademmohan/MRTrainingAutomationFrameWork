package Test.AutomationFramework.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionsRightClick {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement d=driver.findElement(By.xpath("//span[.='right click me']"));
	Actions ac=new Actions(driver);
	ac.contextClick(d).click().perform();
	Thread.sleep(3000);
	ac.moveToElement(driver.findElement(By.xpath("//span[.='Paste']"))).click().perform();
	
	Thread.sleep(5000);
	Alert a=driver.switchTo().alert();
	Thread.sleep(5000);
	String aa=a.getText();
	Thread.sleep(5000);
	System.out.println(aa);
	

}
}
