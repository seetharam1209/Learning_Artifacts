package Day1;

public class ControlStatements2 {
	
	public static void main(String[] args) throws Exception {
		
		// Exception handling
		// Try block
		// Catch block
		// Finally block
		// 1. try, 2. catch, 3. finally, 4. Throw and 5. throws
		
		// 1 try 1 catch
		// 1 try multiple catches --> 
		// 1 try 1 finally
		// 1 try 1 catch 1 finally
		// 1 try multiple catches 1 finally
		// multiple tries 1 catch --> This is not possible
		// Without catch, can there be try --> not possible (Java 8, Java 12 --> it is possible)
		// If you find any issue inside try block, rest of the code will not get executed. It will go to catch/finally block.
		
		// Throw (intentionally a method is throwing an exception) vs throws (method signature)
		
		
		ControlStatements2 cs2 = new ControlStatements2();
		
		// How to handle an exception
		// When you handle an exception flow will not stop and it will proceed with next steps
		// Division 1 (try catch) // math1 // try catch
		// Division 2 (throws) //math2 (try catch) // throws
		
//		cs2.voteVerification(25);
		cs2.voteVerification(12);

		System.out.println("Now running math2");
		cs2.maths2();
		
		System.out.println("Now running math1");
		cs2.maths1();
			
	}
	
	public int divison(int a, int b) { // a = 2, b =0 2/0 ==> arthimetic exception // 2 ways of handling this exception
		int n = a/b; 
		return n;
	}

	// 1way of handling
	public int divison1(int a, int b) { // a = 2, b =0 2/0 ==> arthimetic exception // 2 ways of handling this exception
		int n= 0;
		try {
			n = a/b; 
		} catch(ArithmeticException e) {
//			e.printStackTrace();
		}
		return n;
	}
	
	public int maths1() {
		ControlStatements2 cs2 = new ControlStatements2();
		return cs2.divison1(2,0);
	}
	
	// 2way of handling
		public int divison2(int a, int b) throws ArithmeticException { // a = 2, b =0 2/0 ==> arthimetic exception // 2 ways of handling this exception
			int n = a/b; 
			return n;
		}
		
		
		
		public int maths2() {
			int n = 0;
			try {
			ControlStatements2 cs2 = new ControlStatements2();
			n= cs2.divison2(2,0);
			} catch (Exception e) {
				
			}
			return n;
		}
		
		
		// A method is intentionally throw custom exception
		public void voteVerification(int age) throws Exception {
			if(age < 18) {
				System.out.println("Person is not eligible for vote");
				throw new Exception(" Person is not eligbile for vote");
			} else {
				System.out.println("Person is eligible for vote");
			}
		}
		


}
