package Day1;

public class InheritanceConcept3 extends InheritanceConcept2 {

	// multi level inheritance
	// Hierarchical inheritance
	
	public static void main(String[] args) {
		InheritanceConcept3 ic3 = new InheritanceConcept3();
		ic3.bike();
		house(); //no need to create an object
		job();
		laptop();
		ic3.money(); // IC2 class 
	}
	
	public static void laptop() {
		System.out.println(" This is laptop non-static method from IC3 class");
	}
	
	// WebDriver (driver) extends SearchContext (findElement, findElements)
	// RemoteWebdriver --> Webdriver --> Chromedriver // 
	// In Selenium, where are we using OOPS concepts ?
	
}
