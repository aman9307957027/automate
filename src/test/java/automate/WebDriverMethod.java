package automate;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethod {
public static void main(String args[]) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(); // RIGHT - Implementing Class

driver.get("http://omayo.blogspot.com/");
driver.manage().window().maximize();

// find element  method is use to find single element based on the id
driver.findElement(By.xpath("//textarea[@id='ta1']")).click();

// findELements is use to find multiple elements based on id
List<WebElement> text=driver.findElements(By.xpath("//textarea[@id='ta11']"));
System.out.println(text.size());
driver.get("https://www.amazon.in/");

// get current url
String url=driver.getCurrentUrl();
System.out.println("Current Url: "+url);

//Get page source
String pageSource=driver.getPageSource();
System.out.println(pageSource);

// get title of page
String pageTitle=driver.getTitle();
System.out.println(pageTitle);

// returns window ID (handle)  which is unique alpha numeric value
String windowHandle= driver.getWindowHandle();
System.out.println("WIndow Handle:- "+windowHandle);

// returns window ID's (handles) from all browser windows/tabs opened by the current WebDriver( And they are all unique)
Set<String> windowHandles= driver.getWindowHandles();
System.out.println(windowHandles.size());

// can navigate to other url
driver.navigate().to("https://www.amazon.in/");
Thread.sleep(3000);

// can navigate to previous page
driver.navigate().back();
Thread.sleep(3000);

// can navigate to next page
driver.navigate().forward();
Thread.sleep(3000);

// can refresh the page
driver.navigate().refresh();

// it helps to open new window
driver.switchTo().newWindow(WindowType.WINDOW).navigate().to("https://omayo.blogspot.com/");

// it helps to close current window
driver.close();
Thread.sleep(3000);

// it helps to close all window
driver.quit();

}
}
