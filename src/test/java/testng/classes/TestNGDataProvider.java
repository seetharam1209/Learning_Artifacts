package testng.classes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	
	// Data Provider
	// Method which provides data to test.
	// Same test with different data.
	// Login page --> u have some users.
	// return type should be always multi array object (Object[][])
	// 1 variable, 2 variable,
	// Each row is 1 data.
	// If you have n rows, test will run n times.
	// Data provider name --> optional, mostly people prefer to give name, just to distinguish.
//	
//	@DataProvider
//	public Object[][] method_name() {
//		return new Object[][] {};
//	}
	
	//[public void testng.classes.TestNGDataProvider.testFile()] has no parameters defined 
//	but was found to be using a data provider (either explicitly specified or inherited from class level annotation).
//	Data provider mismatch
//	Method: testFile([])
//	Arguments: [(java.lang.String) user1]
	
	// Data providers will get data from Database --> 10.
	// Select userName, emailID, firstName, lastName, phonenumber from table where col = "5" and rowNum > 10;
	@DataProvider(name = "DP1", indices = {1,3})
	public Object[][] loginData() {
		return new Object[][] {
			{"user0"},
			{"user1"},
			{"user2"},
			{"user3"},
			{"user4"}

			
		};
	}
	
	
	@DataProvider
	public Object[][] loginData2() {
		return new Object[][] {
			{"user1", "pass1"},
			{"user2", "pass1"}
			
		};
	}
	
	@DataProvider
	public Object[][] loginData3() {
		return new Object[][] {
			{"user1", "pass1", "emailID"},
			{"user2", "pass1", "emailID"}
			
		};
	}

	@DataProvider
	public Object[][] loginData4() {
		return new Object[][] {
			{"user1", "pass1", 1},
			{"user2", "pass1", 2}
			
		};
	}
	
	@Test(dataProvider = "loginData4")
	public void testFile4(String var1, String var2, int var3) {
		System.out.println("Test file4 running");
	}
	
	@Test(dataProvider = "DP1")
	public void testFile(String var1) {
		System.out.println("Test file running " + var1);
	}
	
	@Test(dataProvider = "loginData2")
	public void testFile2(String var1, String var2) {
		System.out.println("Test file2 running");
	}
	
	@Test(dataProvider = "loginData3")
	public void testFile3(String var1, String var2, String var3) {
		System.out.println("Test file3 running");
	}
}
