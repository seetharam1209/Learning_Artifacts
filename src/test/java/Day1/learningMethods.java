package Day1;

public class learningMethods {

	public static void main(String[] args) { // 1 method
		
		// 1 method 1 function.

	}
	
	public static void main() { // 1 method // Method overloading concept
		System.out.println(" I am running main method");
	}
	
	public static void method1() { 
		
		// static method
		// public method
		// it returns nothing  // void
		System.out.println(" I am running method1 method");

	}

	public void method2() {
		// public method
		// non-static method
		// it returns nothing
		System.out.println(" I am running method2 method");

	}
	
	private void method3() {
		// private method
		// non-static method
		// it returns nothing
		System.out.println(" I am running method3 method");

	}
	
	void method4() {
		
		// default method
		// it returns nothing
		System.out.println(" I am running method4 method");

	}
	
	
	public String method5() {
		// public method
		// non-static method
		// it returns String
//		System.out.println(" I am running method5 method");
		String s = "Running method5";
		return s;
	}
	
	public int method6() {
		// public method
		// non-static method
		// it returns int
		System.out.println(" I am running method6 method");
		return 0;
	}
	
	
protected int method7() {
	// protected method
	// non-static method
	// it returns int
	System.out.println(" I am running method7 method");
	return 0;

	}

	public int multiplication(int a, int b) {
		return a * b;
	}

// public private protected default
}
