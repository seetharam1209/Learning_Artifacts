package selenium.classes;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsFramesWindowsHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Alerts
//		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
//		WebElement ele = driver.findElement(By.xpath("(//button[text()='Click Me'])[3]"));
//		ele.click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().sendKeys("Sending text from program");
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
		
		
		//Frames
//		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
//		Thread.sleep(2000);
//		List<WebElement> iFrameEle = driver.findElements(By.xpath("//a[@href='https://www.tutorialspoint.com']"));
//		System.out.println(iFrameEle.size());
//		driver.switchTo().frame(0);
//		WebElement newTabEle = driver.findElement(By.xpath("//h1[text()='New Tab']"));
//		System.out.println(newTabEle.getText());
//		driver.switchTo().parentFrame();
//		
//		WebElement nestedFramesEle = driver.findElement(By.xpath("//a[normalize-space()='Nested Frames']"));
//		nestedFramesEle.click();
		
		//WindowHandles
		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		Thread.sleep(2000);
		String parentWindow = driver.getWindowHandle();
//		System.out.println("Session ID: " + parentWindow);
		WebElement ele = driver.findElement(By.xpath("//button[text()='New Tab']"));
//				ele.click();
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		jsUtil.clickElementByJS(ele);
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			if (!(window.equals(parentWindow))) {
//				System.out.println("Session ID: " + window);
				driver.switchTo().window(window);
				WebElement newTab2 = driver.findElement(By.xpath("//h1[text()='New Tab']"));
				System.out.println(newTab2.getText());
			}
		}
		
	}
	

}
