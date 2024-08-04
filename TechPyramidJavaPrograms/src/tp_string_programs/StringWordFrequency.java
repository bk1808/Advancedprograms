package tp_string_programs;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StringWordFrequency {

	public static void main(String[] args) {

		// reverse words in the string
		// find number of occurance of each word
		// find the duplicate words in the given string
		// print only unique words present in the string
		// remove the duplicate words in the given string

		String s = "welcome to tek pyramid welcome to gc18";

		String[] str = s.split(" ");

		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < str.length; i++) {

			if (map.containsKey(str[i])) {

				map.put(str[i], map.get(str[i]) + 1);

			} else {

				map.put(str[i], 1);

			}
		}
		System.out.println("Frequency of string: ");
		for (Entry<String, Integer> dataSet : map.entrySet()) {

			System.out.println(dataSet);

		}

		System.out.println("Duplicate words of string: ");
		for (Entry<String, Integer> data : map.entrySet()) {

			if (data.getValue() > 1) {
				System.out.println(data.getKey());
			}
		}
		System.out.println("Unique words present in string: ");
		for (Entry<String, Integer> data : map.entrySet()) {

			if (data.getValue() == 1) {
				System.out.println(data.getKey());
			}
		}
		System.out.println("Remove duplicate words in string: ");
		
		for (Entry<String, Integer> data : map.entrySet()) {

			
				String keys = data.getKey();
				System.out.println(keys);
			
		}
		

	}

}
