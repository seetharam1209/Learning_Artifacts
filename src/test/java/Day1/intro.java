package Day1;

public class intro {

	public static void main(String[] args) {
		String s = "Hello world";
		System.out.println(s);
//		datatypes();
		String name = "Java";
		System.out.println("I am learnig " + name);
		
		int i = 2, j = 5;
		System.out.println(i+j);
	}
	
	
	public static void datatypes() {
		
		int num = 25; //2
		System.out.println(num);
		long phoneNUmber = 220465657392L;
		System.out.println(phoneNUmber);
		String s = "abc";
		float f = 25.5f;
		double d = 25.5;
		
		char ch = 'M';
		String gender1 = "M"; //1
		boolean bool = false; //3
		
		int a = 10;
		int b = 15;
		int c = 10;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b);
		System.out.println(a/b);

		if(a==b) {
			System.out.println("Both are same");
			}
		if(!(a==b)) { //if(a!=b) 
		System.out.println("Both are NOT same");
		}
		
		//false and true //false
		if(a==b && a==c) {
			System.out.println("All numbers are same");
			//false or true //true
		} else if (a==b || a==c) {
			System.out.println("2 numbers are same");
		} else {
			System.out.println(" All numbers are diff");
		}
		
	}
}
