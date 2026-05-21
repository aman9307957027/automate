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
		// to get attribute value
		WebElement textAreaField2=driver.findElement(By.cssSelector("textarea[cols='30']"));
		String attributeValue=textAreaField2.getAttribute("rows");
		System.out.println("Attribute value:- "+attributeValue);
		
		// to get display text is true or false
		WebElement textDisplayedWithDelay=driver.findElement(By.cssSelector("#delayedText"));
		System.out.println("Text Displayed:- "+textDisplayedWithDelay.isDisplayed());
		Thread.sleep(10000);
		System.out.println("Text Displayed:- "+textDisplayedWithDelay.isDisplayed());
		
		// to get css value
		WebElement dropDownButton=driver.findElement(By.cssSelector(".dropbtn"));
		String cssValue=dropDownButton.getCssValue("background-color");
		System.out.println(cssValue);
		
		// to get screenshort of the element
		File file=dropDownButton.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("src/test/resources/dropdown.png"));
		
		// to get size like height, width
		org.openqa.selenium.Dimension d=dropDownButton.getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
		
		// to clear the textbox
		textAreaField2.clear();
		Thread.sleep(3000);
		
		// to enter input in textbox
		textAreaField2.sendKeys("Welcome To codedisha");
		
		// to switch to alert popup and then accpet it
		driver.findElement(By.cssSelector("#alert1")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		// to see text area or button is enable or disable and able to click or not
		System.out.println("Is text area enabled:- "+textAreaField2.isEnabled());
		
		System.out.println("Is button enabled:- "+driver.findElement(By.cssSelector("#but1")).isEnabled());
		
		// to see the radio option or checkbox is selected or not
		System.out.println("Bike radio button is selected:- "+driver.findElement(By.cssSelector("input[value='Bike']")).isSelected());
		System.out.println("Bicycle radio button is selected:- "+driver.findElement(By.cssSelector("input[value='Bicycle']")).isSelected());
		
	}

}
