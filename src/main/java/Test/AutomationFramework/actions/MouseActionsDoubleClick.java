package Test.AutomationFramework.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionsDoubleClick {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver demo = new ChromeDriver();

		demo.manage().window().maximize();

		demo.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		demo.get("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement doubleclickbutton = demo.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));

		Actions action = new Actions(demo);

		action.doubleClick(doubleclickbutton).perform();

		Alert alert = demo.switchTo().alert();

		String alertareatext = alert.getText();
		
		System.out.println("Text inside alert area :: " + alertareatext);

		alert.accept();

	}

}
