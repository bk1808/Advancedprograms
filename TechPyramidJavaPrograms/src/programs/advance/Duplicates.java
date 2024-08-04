package programs.advance;

import java.util.HashMap;
import java.util.Map.Entry;

public class Duplicates {

	public static void main(String[] args) {

		String word = "language";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < word.length(); i++) {

			if (map.containsKey(word.charAt(i))) {
				map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
			} else {
				map.put(word.charAt(i), 1);
			}

		}
		for (Entry<Character, Integer> ch : map.entrySet()) {
			if (ch.getValue() == 1) {
				System.out.println(ch.getKey());
			}
		}

	}
}