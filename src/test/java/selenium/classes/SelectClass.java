package selenium.classes;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {


		// Select class --> 
		// What do you mean by select
		// Dropdown values select - Only one option
		// Dropdown values select - More than one option
		// Dropdown values deselect - Only one option
		// Dropdown values deselect - More than one option
		// Radio button
		// Checkboxes
		// Tiles
		// Basic rule --> Thumb rule to use Select class --> 
		// Only for select tag --> <a <select --> webelement --> 
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

//		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
//		WebElement selectCountryele = driver.findElement(By.xpath("//select"));
		
//		Select select = new Select(selectCountryele); // This is how you create an object for select class
//		select.selectByVisibleText("Spain");
//		Thread.sleep(5000);
//		select.selectByValue("AGO");
//		Thread.sleep(5000);
//		select.selectByIndex(30);
//		List<WebElement> allCountriesList = select.getOptions();
//		for (WebElement ele : allCountriesList) {
//			System.out.println(ele.getText());
//		}
		
		driver.get("https://demoqa.com/select-menu");
		driver.switchTo().alert().accept(); // Ok/Yes/Accept
		driver.switchTo().alert().dismiss(); //Cancel/No/Back
		driver.switchTo().alert().getText();
		driver.switchTo().frame(0); // method overloading concept --> 
		driver.switchTo().frame("aswift_0");
		WebElement iframeEle = driver.findElement(By.xpath(""));
		driver.switchTo().frame(iframeEle);
		// 1. using index
		// 2. Using ID
		// 3. using xpath

		
		WebElement selectMultipleCars = driver.findElement(By.id("cars"));
		Select select = new Select(selectMultipleCars); 

		if(select.isMultiple()) {
			System.out.println("Multiple cars can be selected");
		} else {
			System.out.println("Multiple cars cannot be selected");
		}
		
		select.selectByVisibleText("Volvo");
		Thread.sleep(5000);
		select.selectByVisibleText("Audi");
		
		driver.switchTo().parentFrame();
		

	}

}
