package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		String parent=driver.findElement(By.xpath("//input[@type='text']/parent::form")).getText();
		System.out.println(parent);
		driver.findElement(By.xpath("//form[@name='form1']/child::input")).sendKeys("aman");
	}

}