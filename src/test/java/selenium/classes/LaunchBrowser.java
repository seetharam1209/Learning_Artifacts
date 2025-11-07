package selenium.classes;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	
	public static void main(String[] args) {
		
		// Launch chrome browser
		
//		2 ways
//		1. traditional way
//		2. Boni gracia --> he created libs
		
		// 1. traditional way
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
		
		
		// 2. Boni gracia --> he created libs
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait eWait = new WebDriverWait(driver,20);
		Wait fWait = new FluentWait(driver)
					.withTimeout(50, TimeUnit.SECONDS)
						.ignoring(NoSuchElementException.class)
						.pollingEvery(Duration.ofSeconds(5));



		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//")).click();
		eWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//"))).click();
		
		
//		driver.get("https://www.google.com");
		driver.get("https://www.apple.com/store");
		System.out.println(driver.getCurrentUrl()); // It will give you current URL --> What is the purpose --> login failed. login success --> 
		System.out.println(driver.getTitle()); // To get the title of the page.
		findElementMethod(driver);
		try {
			findElementsMethod(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.navigate().to("");
//		driver.navigate().refresh();		
//		
//		driver.close(); // It will close that particular browser tab only.
//		driver.quit(); // It will close the driver instance (complete browser window itself)
//		driver.findElement(By.tagName("textarea")).sendKeys("Selenium");
//		driver.findElement(By.id("APjFqb")).sendKeys("Seleniumm ID");
//		driver.findElement(By.name("q")).sendKeys("Seleniumm ID");
//		driver.findElement(By.linkText("Mac")).click();
//		driver.findElement(By.partialLinkText("Watch")).click();
//		driver.findElement(By.className("gLFyf")).sendKeys("classname");

		//xpath: XML Path --> 
		// relative xpath syntax
		// //tagname[@attribute = 'value']
		// <a class="_58ms mlm" id="birthday-help" href="#" title="Click for more information" role="button" aria-describedby="u_0_3_6e" tabindex="0">
		// 		<i class="img sp_98fCI7IVTTz sx_c4643a">
		// 		</i>
		// </a>
		// //a[@id='birthday-help']
		// //a[@class='_58ms mlm']
		// //a[@aria-describedby='u_0_3_6e']
		
		// Using OR & AND
		// //a[@id='birthday-help' and @class='_58ms mlm']
		// //a[@id='birthday-help' or @id='birthday-help1']
		// //a[@id='birthday-help' or @id='birthday-help1' or or @id='birthday-help10' or @id='birthday-help	100']

		// x path functions
		// //a[contains(@id,'birthday-help')]
		// //a[starts-with(@id,'birthday-help')]
		// //a[ends-with(@id,'help')]
		//// div[text()='Birthday']
		// indexing :: (//a[@title='Click for more information'])[n]
		// //a[text()='Apple Watch ']//../../../../../../preceding-sibling::div//a[text()='iPad ']
		// //a[text()='Apple Watch ']//ancestor::div//a[text()='iPad ']

		
		// findElement --> singular --> it can give 0 or 1.
		// findElements --> plural --> it can give 0, 1 or more than 1.
		// 0 --> findElement --> nosuchelement exception
		// 0 --> findElements --> nosuchelementexception will not come.
		
		// findElement --> it will give only 1 element --> WebElement
		//findElements --> will give 1 or more than 1 element --> List of WebElements --> List (it can have duplicate elements)
		
//		WebElement ele = driver.findElement(By.className("gLFyf"));
//		List<WebElement> listEle = driver.findElements(By.className("gLFyf1"));
		
//		System.out.println("Get attribute for ID : " + ele.getAttribute("id"));
//		ele.get
		// What are Java exceptions and what are Selenium exception?
				
	}
	
	public static void findElementMethod(WebDriver driver) {
		System.out.println("I am running findElement Method");
		WebElement ele = driver.findElement(By.xpath("//a"));
		System.out.println(ele.getText());

	}
	
	public static void findElementsMethod(WebDriver driver) throws Exception {
		System.out.println("I am running findElements Method");
		try {
			List<WebElement> eles = driver.findElements(By.xpath("//a"));
			System.out.println(" Number of links on the page " + eles.size());
			for (WebElement ele : eles) {
				String text = ele.getText();
				if (!text.equals("")) {
//					System.out.println(ele.getText() + " link for this text is " + ele.getAttribute("href"));
					String urlString = ele.getAttribute("href");
					URL url = new URL(urlString);
					int respCode = isLinkBroken(url);
					if (!(respCode == 200)) {
						System.out.println("Response code " + respCode + " for a given URL : " + urlString);
					}

				}
//				if (text.equals("iPad")) {
//					ele.click();
//				}
			}
		} catch (StaleElementReferenceException ex) {
			System.out.println("Got StaleElement exception and running catch block now");
		}
	}
	
	//FindElements
	// Staleementreferenceexception
	// How to avoid it
	// Try catch
	// if
	// if else
	// if else if esle if else
	// find the broken links on the webpage
	
	public static int isLinkBroken(URL url) throws Exception {
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		try {
			connection.connect();
			int responseCode = connection.getResponseCode();
			connection.disconnect();
			return responseCode;
		} catch (Exception exp) {
			exp.getMessage();
		}
		return 0;
	}

}
