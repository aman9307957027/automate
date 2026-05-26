package automate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleAlertsInSelenium {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://omayo.blogspot.com/");
driver.manage().window().maximize();
driver.findElement(By.cssSelector("#prompt")).click();
// switch to alert prompt using switchTo() method
Alert alert=driver.switchTo().alert();
alert.sendKeys("Hello");
System.out.println(alert.getText());

// Use this method to click ok
//alert.accept();

// Use this method to click cancel
alert.dismiss();

driver.findElement(By.cssSelector("#ta1")).sendKeys("Aman");
	}
	

}
