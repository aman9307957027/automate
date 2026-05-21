package automate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownCommingUnderSelectTagMultiSelection {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement multiSelectionDropdown=driver.findElement(By.cssSelector("#multiselect1"));
		Select select=new Select(multiSelectionDropdown);
		
		// to select option which contains visible text
		select.selectByContainsVisibleText("Aud");
		
		// to select option by index value 
		select.selectByIndex(0);
		
		// to select option by value
		select.selectByValue("Hyundaix");
		
		// get all selected options
		List<WebElement> allSelectedOptions=select.getAllSelectedOptions();
		for(WebElement opt:allSelectedOptions) {
			System.out.println(opt.getText());
		}
		
		// get first selected option
		WebElement firstSelectedOption=select.getFirstSelectedOption();
		System.out.println("First selected option:- "+firstSelectedOption.getText());
		
		// get all options
		List<WebElement> allOptions=select.getOptions();
		for(WebElement opt:allOptions) {
			System.out.println(opt.getText());
		}
		
		// to check if if multiple selection is allowed or not
		System.out.println("Multi select allowed:- "+select.isMultiple());
		
		// to deselect all selected option
		select.deselectAll();
		Thread.sleep(3000);
		
		// to select option which contains visible text
		select.selectByContainsVisibleText("Aud");
		
		// to select option by index value
		select.selectByIndex(0);
		
		// to select option by value
		select.selectByValue("Hyundaix");
		
		// to select option by visible text
		select.selectByVisibleText("Swift");
		Thread.sleep(3000);
		
		// to deselect option which contains visible text
		select.deSelectByContainsVisibleText("Aud");
		Thread.sleep(3000);
		
		// to deselect option by index value
		select.deselectByIndex(0);
		Thread.sleep(3000);
		
		// to deselect option by value
		select.deselectByValue("Hyundaix");
		Thread.sleep(3000);
		
		// to deselect option by visible text
		select.deselectByVisibleText("Swift");
	}

}
