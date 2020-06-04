package collectionsTutorial;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		// Creating HashMap with default initial capacity and load factor

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// Inserting key-value pairs to map using put() method

		map.put("ONE", 1);

		map.put("TWO", 2);

		map.put("THREE", 3);

		map.put("FOUR", 4);

		map.put("FIVE", 5);

		// Printing key-value pairs

		Set<Entry<String, Integer>> set = map.entrySet();
		for (Entry<String, Integer> entry : set) {
			System.out.println(" Map values are " + entry.getKey() + " " + entry.getValue());

		}
		map.put("Six", 6);
		map.put("Seven", 7);
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		map.putAll(map1);
		Set<Entry<String, Integer>> set1 = map.entrySet();
		for (Entry<String, Integer> entry : set1) {
			System.out.println(" Map values are " + entry.getKey() + " " + entry.getValue());

		}
		map.putIfAbsent("Eight", 8);
		Set<Entry<String, Integer>> set2 = map.entrySet();
		for (Entry<String, Integer> entry : set2) {
			System.out.println(" Map values are " + entry.getKey() + " " + entry.getValue());

		}

	}
}
