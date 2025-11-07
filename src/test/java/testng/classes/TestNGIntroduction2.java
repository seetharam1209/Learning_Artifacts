package testng.classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGIntroduction2 {
	
//	BrowserSelection
//	BrowserLaunch
//	Application launch 
//	Sign in
	// Reports --> Initiation
	// Driver initiation
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is after class method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This is after test method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This is After suite method");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is before suite method");
	}
	
	@BeforeSuite
	public void beforeSuite2() {
		System.out.println("This is before suite 2 method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before test method");
	}
	
	
	
	@Test(priority = 2, timeOut = 5000, enabled = true, groups = {"smoke", "regression"})
	public void testFile() throws InterruptedException {
		Thread.sleep(10000);
		System.out.println("Test file running");
	}
	
	@Test(priority = 1, description = "This is a menu feature functionality", enabled = true)
	public void testFile2() {
		System.out.println("Test file running2");
	}
	@Test(priority = 4, description = "This is a login feature functionality", dependsOnMethods = {"testFile"}, groups = {"smoke"}, alwaysRun = true)
	public void testFile3() {
		System.out.println("Test file running3");
	}
	@Test(priority = 0, enabled = true, groups = {"smoke"}, invocationCount = 3)
	public void testFile4() {
		System.out.println("Test file running4");
	}
	
	
	
}
