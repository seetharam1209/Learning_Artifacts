package Day1;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {

		// Primitive data types.
		// Strings --> data type non-primitive data and there is NO fixed length for this.
		// String is itself a class
		// to create an object for a given class, we will be using new keyword
		// String class has lot of inbuilt methods.
		// String is called immutable --> it can't be changed. (this is very imp interview question)
		// String is called final.
		// StringBuilder and StringBuffer --> 2 classes --> mutable.
		// Commonly used data type.
		
		int n1 = 10;
		String s = "Sam";
		String s1 = new String("Sammy"); //no one will do like this.
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.charAt(1)); //a
		System.out.println(s.length()); //3
		System.out.println(s.concat("uel")); //Samuel
		System.out.println(s.replace('a', 'u')); //Sum
		System.out.println(s.substring(1)); //am
		System.out.println(s1.substring(1,4)); //amm

		String s2 = "PRATHAP THURUPU/RUDRA/SATHISH/ANUSHA";
		System.out.println(s2.substring(1,5)); // Why we remember these methods.
		
		String s3 = " I aScsa sacs a sacsa ";
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s3.trim());
		System.out.println(Arrays.toString(s3.split(" ")));
		
		// Reverse the string //Palindrome LIRIL --> mini-assignment
		// Samuel George //George Samuel // reversing a words in a given string
		// Print what is 3rd character
		// Print how many times a particular character is present. // Collections //sort --> HashMap concept
		
//		1 to 10
//		10 to 1
		
		for (int n = 0; n <10; n++) {
			System.out.println(n);
		}

		System.out.println(" in Reverse order ");

		for (int n = 10; n > 0; n--) {
			System.out.println(n);
		}
		
		// PRATHAP
		// PAHTARP
		
		for (int n = s2.length(); n > 0; n--) {
			System.out.print(s2.charAt(n-1));
		}
		
		System.out.println();
		String[] sArray = s2.split("/");
		for (int n = sArray.length ; n > 0; n-- ) {
			System.out.print(sArray[n-1] + " ");
		}
		
		System.out.println("");
		// String is immutable
		// Mutable --> StringBuilder (is not a thread safe, faster) and StringBuffer (is thread safe, slower)
		
		String sa = new String("Sammy"); //no one will do like this.
		StringBuilder sb = new StringBuilder("Sammy2");
		StringBuffer sbuffer = new StringBuffer("Sammy3");
		
		System.out.println(sa);
		sa.concat(" Daniel");
//		sa.charAt(0);
//		System.out.println(sa);
		System.out.println(sa);
		
		System.out.println(sb);
		sb.append(" Daniel");
		System.out.println(sb);
		
		System.out.println(sbuffer);
		sbuffer.reverse();
		System.out.println(sbuffer);
		
		//regex --> 

	}

}
