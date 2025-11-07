package Day1;

public class Student {
	
	// encapsulation
	// Real time example : Car --> Start/stop --> 
	// Unnecessary, complex, safety, security
	
	// Set your name, update your name in your PAN Card (Authorization)
	// get your pan card information -->  (not required authorization)
	// Usage of abstraction/encapsulation --> less than 1%. Mostly try to remember the concepts.
	
	// how do you achieve encapsulation? is by using private keyword for attributes, methods
	// Google authorization.
	
	private int rollNum;
	private String name;
	
	public int getRollNum() {
		return rollNum;
	}
	
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
