package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CollectionsMap {

	// Void, return type

	// No static

	public CollectionsMap() {
		System.out.println(" default constructor");
	}

	public CollectionsMap(String s) {
		System.out.println(" String constructor");

	}

	public CollectionsMap(int s) {
		System.out.println(" Integer constructor");
	}

	public static void main2(String[] args) {

		// Map -->
		// prathap
		// String --> give me how many A to Z -->
		// key --> value pairs
		// p --2
		// r --> 1
		// a --> 2
		// t --> 1
		// h --> 1
		// key should always be unique.
		// Values can be duplicates.
		// Key can't be null for TreeMap
		// Values can be null
		// p --> 10
		// Map is an interface
		// Map implemented by --> HashMap, LinkedHashMap
		// Set implemented by --> HashSet LinkedHashSet
		HashSet<Integer> hs2 = new HashSet<>(); // Integer HashSet
		HashMap<Character, Integer> hm1 = new HashMap<>(); // Key is String, Value is also string

		HashMap<String, String> hm = new HashMap<>(); // Key is String, Value is also string
//		LinkedHashMap<String, String> hm = new LinkedHashMap<>(); // Key is String, Value is also string
//		TreeMap<String, String> hm = new TreeMap<>(); // Key is String, Value is also string

		hm.put("1", "Abhi");
		hm.put("2", "Bharath");
		hm.put("3", null);
		hm.put("1", "Rakhi"); // here I am giving 1 again (key is given 2nd time)
		hm.put("5", "Prathap");
		hm.put("", "Abhi");
//		hm.put(null, "Abhi2");

		System.out.println(hm);

		// tabular column
		// Data in rows and columns.
		//

		// key value pairs

//		hm.clear();
		System.out.println(hm.get("2")); // return the value based on the key provided
		System.out.println(hm.getOrDefault("20", "Ram")); // return the value based on the key provided
		hm.remove("5");
		System.out.println(hm);
		hm.replace("2", "Sam"); // replace or put --> give same result
		System.out.println(hm);
		System.out.println(hm.size());

		String s = "prathap thurupu";

		for (int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			int count = hm1.getOrDefault(key, 0);
			if (count > 0) {
				count++;
			} else {
				count = 1;
			}
			hm1.put(key, count);
		}
		System.out.println(hm1);

		// iterator
		// for loop --> advanced --> for each loop
		// Constructor

		// Map, list, set --> interfaces
		// HashMap, LinkedHashMap
		// ArrayList, LinkedList
		// HashSet, LinkedHashSet

		// Iterator --> 1 interface
		// Iterator is used for collections --> List, Set and Map

	}

	public static void main(String[] args) {
		
		CollectionsMap cm = new CollectionsMap();
//		ArrayList<String> al = new ArrayList<>(); // String arraylist
//		al.add("SamArrayList");
//		al.add("ShivaArrayList");
//		al.add("SundarArrayList");
//		
//		System.out.println(Arrays.toString(al.toArray()));

		LinkedHashSet<String> hs = new LinkedHashSet<>(); // String LinkedHashSet
		hs.add("SamHashSet");
		hs.add("SHivaHashSet");
		hs.add("SundarHashSet");
		System.out.println(Arrays.toString(hs.toArray()));

		Iterator<String> it = hs.iterator(); // more important

		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		for (String s : hs) {
			System.out.println(s);
		}

		HashMap<String, String> hm = new HashMap<>();
		Map<String, String> hm1 = new HashMap<>();

		hm.put("1", "Abhi");
		hm.put("2", "Bharath");
		hm.put("3", null);
		hm.put("4", "Rakhi");
		hm.put("5", "Prathap");
		hm.put("6", "Abhi");

		Iterator<Entry<String, String>> it2 = hm.entrySet().iterator(); // more important

		while (it2.hasNext()) {
			Entry<String, String> s = it2.next();
			System.out.println("key : " + s.getKey() + " Value : " + s.getValue());
		}
		
		// object type
		
		String s = "Sam";
		Prathap s1 = new Prathap();
		// Object type --> Prathap
		// Object reference --> s1
		// Object --> new Prathap();
		
		// Type of that particular object
		Arrays1 s2 = new Arrays1();
		Arrays1 s3  = s1.method1();		
		

	}

}
