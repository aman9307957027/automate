package automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
public class Basics_Of_Selenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // RIGHT - Implementing Class

	driver.get("http://omayo.blogspot.com/");
	driver.manage().window().maximize();
	

	}
}

