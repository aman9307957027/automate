package automate;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Locator_Strategies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // RIGHT - Implementing Class

	driver.get("http://omayo.blogspot.com/");
	driver.manage().window().maximize();
	
//By.name 
	
	WebElement login=driver.findElement(By.name("form1"));
	System.out.println(login.getText());
	
//By.clsssName
	
	WebElement title=driver.findElement(By.className("title"));
	System.out.println(title.getText());
	
// findElements example for multiple value
	
	List<WebElement> titlee=driver.findElements(By.className("title"));
	System.out.println("Number of titles are:-"+titlee.size());
	for(WebElement titles:titlee) {
		System.out.println(titles.getText());
	}
	
//	By.id
	
	driver.findElement(By.id("ta1")).sendKeys("Hello Gyues");

//By.tagName
	
	List<WebElement> textArea=driver.findElements(By.tagName("textArea"));
	for(WebElement textAreas:textArea) {
		
		System.out.println(textAreas.getText());
		textAreas.clear();
		textAreas.sendKeys("Hello \nhello");
	}
	

//By.linkText
	
	driver.findElement(By.linkText("http://www.Selenium143.blogspot.com")).click();
	
//By.partialLinkText
	
	driver.findElement(By.partialLinkText("P")).click();

	}
	}

