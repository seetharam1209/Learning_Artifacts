package Day1;

public class MethodOverloading {
	
	
	// Method overloading
	// same method name
	// different parameters/signature
	// All methods should in same class
	// compile time polymorphism

	//sum()	
	public void sum() {
		System.out.println(" Blank sum method");
	}
	
	//sum (int, int)
	public void sum(int a, int b) { //2
		System.out.println(" Sum of 2 numbers : " + a+b);
	}
	
	//sum (int, int , int)
	public void sum(int a, int b,int c) { //2
		System.out.println(" Sum of 2 numbers : " + a+b+c);
	}
	
	//sum (int, String)
	public void sum(int a, String b) { //2
		System.out.println(" Sum of 3 numbers : " + a+b);
	}
	
	//sum (String, String)
		public void sum(String a, String b) { //2
			System.out.println(" Sum of 3 numbers : " + a+b);
		}
}
