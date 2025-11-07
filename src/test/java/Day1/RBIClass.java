package Day1;

public abstract class RBIClass {
	
	// 1. Abstract class will have abstract keyword
	// 2. Abstract class can have abstract methods/non-abstract methods.
	// 3. 100% abstraction is achieved by interface.
	// 4. You can't create object for Abstract class.
	// 5. Interface --> Static methods can present. Static methods belong to class and not object.
	// 6. Abstract class --> extends. 
	// 7. interface --> implements.
	
	
	// abstract method
	public abstract void personalLoan();
	
	
	// Non-abstract method
	public void homeLoan() {
		System.out.println(" Minium home loan should be 7%");
	}
	
	public abstract void depositInterest();

}
