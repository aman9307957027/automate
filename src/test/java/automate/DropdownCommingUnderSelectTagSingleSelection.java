package automate;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownCommingUnderSelectTagSingleSelection {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement singleSelectionDropdown=driver.findElement(By.cssSelector("#drop1"));
		Select select=new Select(singleSelectionDropdown);
		// deselect related method will not work on single selection dropdown
		// if we call deselect related method it will throw 
		// java.lang.UnsupportedOperationException
		// select.deselectAll();
		
		// get all selected options
		java.util.List<WebElement> allSelectedOption= select.getAllSelectedOptions();
		for(WebElement selectedOption:allSelectedOption) {
			System.out.println("All selected options are:- "+selectedOption.getText());
		}
		
		// get first selected option
		WebElement getFirstSelectedOption=select.getFirstSelectedOption();
		System.out.println("First selected option is:- "+getFirstSelectedOption.getText());
		
        // get all options
		java.util.List<WebElement> allOptionsFromDropdown=select.getOptions();
		for(WebElement opt:allOptionsFromDropdown) {
			System.out.println(opt.getText());
		}
		
		// to check is multiple option selection is allowed
		System.out.println("Is multiple selection allowed:- "+select.isMultiple());
		
		// to select option which contains visible text
		select.selectByContainsVisibleText("4");
		Thread.sleep(3000);
		
		// to select option by index value
		select.selectByIndex(3);
		Thread.sleep(3000);
		
		// to select option by value
		select.selectByValue("def");
		Thread.sleep(3000);
		
		// to select option by visible text
		select.selectByVisibleText("Older Newsletters");
	}

}
