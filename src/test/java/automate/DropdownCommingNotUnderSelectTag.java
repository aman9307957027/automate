package automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownCommingNotUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://omayo.blogspot.com/");
driver.manage().window().maximize();

DropdownCommingNotUnderSelectTag.selectOptionsFromDropdown(driver,"gmail");
//driver.findElement(By.cssSelector(".dropbtn")).click();
//Thread.sleep(10000);
//List<WebElement> allOptions=driver.findElements(By.xpath("//div[@id='myDropdown']/a"));
//for(WebElement options:allOptions) {
//	if(options.getText().equals("Flipkart")) {
//		options.click();
//		break;
//	}
//}
	}
public static void selectOptionsFromDropdown(WebDriver driver,String optionToSelect) throws InterruptedException {
	driver.findElement(By.cssSelector(".dropbtn")).click();
	Thread.sleep(10000);
	List<WebElement> allOptions=driver.findElements(By.xpath("//div[@id='myDropdown']/a"));
	for(WebElement options:allOptions) {
		if(options.getText().equalsIgnoreCase(optionToSelect)) {
			options.click();
			break;
		}
	}
	
}

	}


