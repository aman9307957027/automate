package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HowToHandleFrames {
	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement frame=driver.findElement(By.cssSelector("#navbar-iframe"));
		
// 		Use frame index method to find frame by index value
// 		driver.switchTo().frame(0);
		
// 		User frame find by name or id method to find frame
// 		driver.switchTo().frame("navbar-iframe");
		
// 		Use frame find by webElement to find frame
		driver.switchTo().frame(frame);
		WebElement dropDown=driver.findElement(By.xpath("//select[@aria-label='More options']"));
		Select select=new Select(dropDown);
		select.selectByVisibleText("Share by email");
		
//		User default content method to switch to main window
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("#ta1")).sendKeys("Hello");
		
	}

}
