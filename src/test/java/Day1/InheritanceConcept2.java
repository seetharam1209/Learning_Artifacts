package Day1;

public class InheritanceConcept2 extends InheritanceConcept {
//public class InheritanceConcept2 {

	
	int b = 20;
	
	public static void job() {
		System.out.println( " job non-static method in inheritance concept 2 class ");
	}
	
	public void money() {
		System.out.println( " money non-static method in inheritance concept2 class ");
	}
	
	public static void main(String[] args) {
//		InheritanceConcept2 ic2 = new InheritanceConcept2();
//		ic2.bike();
//		job();
//		ic2.money();
//
//		InheritanceConcept ic = new InheritanceConcept();
//		ic.bike();
//		InheritanceConcept.job(); // child to parent --> it doesn't work.
//		ic.money();
		
		InheritanceConcept ic = new InheritanceConcept();
		ic.money();
		InheritanceConcept ic2 = new InheritanceConcept2();
		// parent = new child();
		// Create an object of the child by using parent also.
		// Webdriver driver = new ChromeDriver(); // interview question
		ic2.money();
		InheritanceConcept2 ic3 = new InheritanceConcept2();
		// child = new child();		ic3.money();
	}
	
	// single inheritance
	// 

}
