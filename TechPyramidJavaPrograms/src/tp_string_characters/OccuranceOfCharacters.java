package tp_string_characters;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceOfCharacters {

	// 1. find the number of occurance of each character of the given string
	// 2. print only duplicated characters in the given string
	// 3. print only unique characters in the given string
	// 4. remove duplicate characters in the given string

	public static void main(String[] args) {

		String s = "soo challenging to be simple";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}
		System.out.println("Number of occurance of each character: ");
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> set : entrySet) {

			System.out.println(set);
		}

		System.out.println("Print only Unique characters: ");
		for (Entry<Character, Integer> data : map.entrySet()) {

			char key = data.getKey();
			int value = data.getValue();
			if (value == 1) {

				System.out.println(key + "==" + value);
			}

		}

//		keySet() and values() methods are present in HashMap which we can iterate in the for each loop
		Set<Character> set = map.keySet();
		Collection<Integer> values = map.values();

		for (Integer value : values) {
//			System.out.println(value);
		}

//		Set<Entry<Character, Integer>> list = map.entrySet();
//Entry is an Interface which has two methods called getValue() and getKey() to use these methods we need to convert map to entrySet()
		System.out.println("Duplicate characters: ");
		for (Entry<Character, Integer> dataSet : map.entrySet()) {
			if (dataSet.getValue() > 1) {
				System.out.println(dataSet);
			}

		}

		System.out.println("Remove Duplicate characters: ");
		for (Character key : set) {
			System.out.print(key);
		}

	}

}
