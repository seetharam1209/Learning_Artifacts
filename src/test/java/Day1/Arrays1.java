package Day1;

import java.util.Arrays;

public class Arrays1 {

	public static void main2(String[] args) {
//		printArrays();
		
		learningMethods lM = new learningMethods(); // learningMethods --> class // lM --> object of that particular class
		lM.method2(); // concept 1.
//		learningMethods.method2();
		learningMethods.method1(); //concept 2 // static methods belong to class.
//		lM.method3(); //concept 3 --> private methods cannot be accessed out of that particular class.
		lM.method4(); // default methods can also be accessed.
		String actualValue = lM.method5(); // returns String //concept5
//		System.out.println(actualValue);
		int a = lM.method6(); // concept 6
		lM.method7();// concept 7
		
		System.out.println(lM.multiplication(3,4)); //signature
		System.out.println(lM.multiplication(3,5)); //signature
		System.out.println(lM.multiplication(5,4)); //signature
		System.out.println(lM.multiplication(8,7)); //signature
		System.out.println(lM.multiplication(13,14)); //signature
		System.out.println(lM.multiplication(3535,433444)); //signature

		
	}
	public static void main1(String[] args) {

		int a = 10;

		System.out.println(a);

		String b = "Ram";
		String c = "Ramu";
		String d = "Ramanji";
		String[] s = { "Ram", "Ramu", "Ramanji" }; // String Array //unlimitted numbers in this Array
		int[] n = { 10, 12, 15 }; // int array
		char[] ch = { 'c', 'a', 'm' };

		String[] s1 = new String[19]; // s1 array --> only 11 members.
		// new we will talk more in later classes.
		s1[0] = "Sam";
		s1[1] = "Ram";
		s1[2] = "Ramu";
		s1[3] = "Ramanaji";
		s1[4] = "Ravi4";
		s1[5] = "Ravi5";
		s1[16] = "Ravi6";
		s1[7] = "Ravi7";
		s1[8] = "Ravi7";
		s1[9] = "Ravi9";
		s1[10] = "Tom";
		s1[11] = "Thomas";
		s1[12] = "David";

//		System.out.println(s1.toString());
		System.out.println(Arrays.toString(s1));

		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[0] = 60;
		numbers[1] = 20;
//		numbers[2] = 30;
//		numbers[3] = 40;
		numbers[4] = 50;
//		numbers[5] = 60;

		String s12 = "Sam";
		String s13 = "Sam";
		s13 = "same";
		System.out.println("Printing string " + s13);

//System.out.println(numbers.toString());
		System.out.println(Arrays.toString(numbers));

// default String value is null
// default int value is 0
// default boolean value is false
// default char value is blank
// default long value

		char[] ch1 = new char[2];
		System.out.println(Arrays.toString(ch1));

	}
	
	
	public static void printArrays() {
		int[] a = {1, 3, 5, 7,14, 16, 17 }; //6
		//0 to n-1 where n is the total length of the array. // a.length
//		System.out.println(Arrays.toString(a));
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("index : " + i + " value is : " + a[i]);
		}
		
		int[][] da = { 
				{1, 3, 4, 5}, 
				{2, 4, 6, 8} 
				};
		
		//print double array values //mini assignment.
		
		}

	
	public static void main(String[] args) {
		
//		intro car3 = new intro();
		
		System.out.println(" Running print methods");

		Vehicle car = new Vehicle(); // object is created using new keyword
		car.numberofWheels = 4;
		car.color = "Blue";
		car.numberOfPassengers = 5;
		car.variant = "Diesel";
		car.display();
		car.checkEngine();
		
		System.out.println("Car is made of " + car.numberOfPassengers + " " + car.color + " " + car.numberofWheels);
		
		Vehicle car2 = new Vehicle(); // object is created using new keyword
		car2.numberofWheels = 4;
		car2.color = "Black";
		car2.numberOfPassengers = 7;
		
		Vehicle bike = new Vehicle();
		Vehicle auto = new Vehicle();

		
		
	}
}
