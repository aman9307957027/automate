package automate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XPath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
// xpath with single attribute
		driver.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("Hello");
		
// xpath with multiple attribute
		driver.findElement(By.xpath("//input[@id='prompt'][@onclick='getPrompt()']")).click();
		
// add on topic to switch to alert popup and close it
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
// xpath with and operator
		driver.findElement(By.xpath("//input[@autocomplete='off' and @class='gsc-input']")).sendKeys("How are youe");
		
// xpath with or operator
		driver.findElement(By.xpath("//input[@id='textbox1' or @value='Selenium WebDriver']")).click();
		
//xpath with inner text
		driver.findElement(By.xpath("//span[text()='Blogs']")).click();
		
		boolean displayStatus=driver.findElement(By.xpath("//span[text()='Monday, May 13, 2013']")).isDisplayed();
		System.out.println(displayStatus);
		
		String value=driver.findElement(By.xpath("//span[text()='Monday, May 13, 2013']")).getText();
		System.out.println(value);
		
//xpath wtih contains method
		driver.findElement(By.xpath("//input[contains(@class,'gsc')]")).sendKeys("Hello");
		
		//driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("hi");
		
//xpath with starts-with method
	driver.findElement(By.xpath("//input[starts-with(@type,'password')]")).sendKeys("Moshi Moshi");
	
// chained xpath
	String option=driver.findElement(By.xpath("//select[@id='multiselect1']/option[2]")).getText();
	System.out.println(option);
	
	}	
}
