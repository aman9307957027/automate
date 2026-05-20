package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		// id selector
		driver.findElement(By.cssSelector("textarea#ta1")).sendKeys("Aman");
		// class selector
		driver.findElement(By.cssSelector("select.combobox")).sendKeys("Hi");
		// starts-with selector
		driver.findElement(By.cssSelector("textarea[id^='ta1']")).sendKeys("How");
		// ends-with selector
		driver.findElement(By.cssSelector("textarea[id$='1']")).sendKeys("Are");
		// 
		driver.findElement(By.cssSelector("textarea[id*='a']")).sendKeys("You");
		

	}

}
