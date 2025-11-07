package testng.classes;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertionHardAndSoft {
	
	SoftAssert sa;

	@BeforeClass
	public void declarations() {
		 sa = new SoftAssert(); //1. declaration

	}
	
	
	@Test
	public void hardAssertTesting() {
		String expectedValue = "sam";
		String actualValue  = "Ram";
		Assert.assertEquals(expectedValue, actualValue);
		System.out.println("This is hard Assert");
	}
	
	
	@Test
	public void softAssertTesting() {
		String expectedValue = "sam";
		String actualValue  = "Ram23";
		sa.assertEquals(expectedValue, actualValue); //2 .usage
		System.out.println("This is soft Assert");
	}
	
	@Test
	public void softAssertTesting2() {
		String expectedValue = "sam2";
		String actualValue  = "Ram2";
		sa.assertEquals(expectedValue, actualValue); //2 .usage
		System.out.println("This is soft Assert2");
	}
	
	@AfterClass
	public void printAll() {
		sa.assertAll(); //3. Display all the asserts/error messages		

	}
}
