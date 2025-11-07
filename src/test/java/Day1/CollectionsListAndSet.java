package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CollectionsListAndSet {

	public static void main(String[] args) {

		String[] arr = new String[5]; //String array
		int[] arr2 = new int[5]; // integer Array
		char[] arr3 = new char[5]; // Char array
		
		arr[0] = "Sam";
		arr[1] = "Shiva";
		arr[3] = "Sundar";
		
		System.out.println(Arrays.toString(arr));
		
		// Where will be implement these in Selenium?
		ArrayList<String> al = new ArrayList<>(); // String arraylist
		ArrayList<Integer> al2 = new ArrayList<>(); // Integer ArrayList
		ArrayList<Character> al3 = new ArrayList<>(); // Char ArrayList
		al.add("SamArrayList");
		al.add("SHivaArrayList");
		al.add("SundarArrayList");
		al.add("SundarArrayList");
		al.add("SundarArrayList");
		al.add("SundarArrayList");
		al.add("SundarArrayList");

		System.out.println(Arrays.toString(al.toArray()));
		
		al.remove(0);
		System.out.println("After removing 0 index" + Arrays.toString(al.toArray()));
		al.clear();

		System.out.println("After clearing " + Arrays.toString(al.toArray()));

		// Add, remove, clear --> are functions of list/set
		
		// Set
//		HashSet<String> hs = new HashSet<>(); // String HashSet
//		[SHivaHashSet, SundarHashSet, SamHashSet]

		LinkedHashSet<String> hs = new LinkedHashSet<>(); // String LinkedHashSet
//		[SamHashSet, SHivaHashSet, SundarHashSet]

		HashSet<Integer> hs2 = new HashSet<>(); // Integer HashSet
		HashSet<Character> hs3 = new HashSet<>(); // Char HashSet
		
		hs.add("SamHashSet");
		hs.add("SHivaHashSet");
		hs.add("SundarHashSet");
		hs.add("SundarHashSet");
		hs.add("SundarHashSet");
		hs.add("SundarHashSet");
		hs.add("SundarHashSet");
		System.out.println(Arrays.toString(hs.toArray()));

	}

}
