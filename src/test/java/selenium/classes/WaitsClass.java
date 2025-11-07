package selenium.classes;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsClass {

	public static void main(String[] args) throws InterruptedException {

		// Thread.sleep --> Java
		// Implicit wait --> Selenium
		// Explicit wait --> Selenium
		// Fluent wait --> Selenium
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://www.apple.com/store");
		
		WebDriverWait eWait = new WebDriverWait(driver, 20); // Explicit wait
		
		Wait<WebDriver> fluentWait = new FluentWait<>(driver)
			    .withTimeout(Duration.ofSeconds(20))
			    .pollingEvery(Duration.ofSeconds(5))
			    .ignoring(NoSuchElementException.class); // Fluent wait
		
		WebElement macEle = driver.findElement(By.xpath("//a[@data-autom='AOS: home/shop_mac']"));
//		macEle.click(); //implicit wait
		eWait.until(ExpectedConditions.elementToBeClickable(macEle)).click(); //explicit wait
		fluentWait.until(ExpectedConditions.elementToBeClickable(macEle)).click(); // Fluent wait
		
		

	}

}
