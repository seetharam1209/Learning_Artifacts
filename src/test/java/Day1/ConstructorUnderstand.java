package Day1;

public class ConstructorUnderstand {
	
	
	int a = 10;
	String name = "COnstr";
	
	// Constructor is of 3 types.
	// Default
	// Implicit
	// Explicit
	
	// Method name and class name are same
	// When you create an object for the class, constructor will be executed.
	
	public ConstructorUnderstand () {
		System.out.println(" THis is constructor Method");
	}
	
	public ConstructorUnderstand (String sample) {
		this.name = sample;
		System.out.println(" THis is constructor " + name + " Method");
	}

}
