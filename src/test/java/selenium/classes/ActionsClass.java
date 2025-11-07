package selenium.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/selectable.php");
		
		//Actions class -->>
		// Anything which you do with mouse, Actions class will do it for us in Selenium
		// Right click
		// Drag and drop
		// Double click
		// Hose over
		// Move to particular section in the page (top right) (top left) --> move to particular element
		
//		WebElement ele = driver.findElement(By.xpath("//table[contains(@class,'table-sortable')]//tbody//tr//span"));
//		WebElement targetEle = driver.findElement(By.xpath("(//table[contains(@class,'table-sortable')]//tbody//tr//span)[3]"));

		
		Actions actions = new Actions(driver);
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		Thread.sleep(5000);
//		actions.dragAndDrop(ele, targetEle).build().perform();
		WebElement ele = driver.findElement(By.xpath("(//*[@id='nav-home']//li)[3]"));
//		jsUtil.flash(ele); //Flash
		jsUtil.drawBorder(ele);
		Thread.sleep(5000);
		actions.doubleClick(ele).build().perform();
		Thread.sleep(5000);
		actions.contextClick(ele).build().perform();
		System.out.println("Program is completed");
		
	}

}
