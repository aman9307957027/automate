package automate;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement textAreaField2=driver.findElement(By.cssSelector("textarea[cols='30']"));
		String attributeValue=textAreaField2.getAttribute("rows");
		System.out.println("Attribute value:- "+attributeValue);
		WebElement textDisplayedWithDelay=driver.findElement(By.cssSelector("#delayedText"));
		System.out.println("Text Displayed:- "+textDisplayedWithDelay.isDisplayed());
		Thread.sleep(10000);
		System.out.println("Text Displayed:- "+textDisplayedWithDelay.isDisplayed());
		WebElement dropDownButton=driver.findElement(By.cssSelector(".dropbtn"));
		String cssValue=dropDownButton.getCssValue("background-color");
		System.out.println(cssValue);
		File file=dropDownButton.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("src/test/resources/dropdown.png"));
		org.openqa.selenium.Dimension d=dropDownButton.getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
		textAreaField2.clear();
		Thread.sleep(3000);
		textAreaField2.sendKeys("Welcome To codedisha");
		driver.findElement(By.cssSelector("#alert1")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Is text area enabled:- "+textAreaField2.isEnabled());
		System.out.println("Is button enabled:- "+driver.findElement(By.cssSelector("#but1")).isEnabled());
		System.out.println("Bike radio button is selected:- "+driver.findElement(By.cssSelector("input[value='Bike']")).isSelected());
		System.out.println("Bicycle radio button is selected:- "+driver.findElement(By.cssSelector("input[value='Bicycle']")).isSelected());
		
	}

}
