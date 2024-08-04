package tp_string_programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateWordsFromString {

	public static void main(String[] args) {

		String s = "welcome to tp welcome to gc18";
		String [] str = s.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0 ; i<str.length ; i++) {
			
			if(map.containsKey(str[i])) {
				map.put(str[i], map.get(str[i])+1);
			}
			else {
				map.put(str[i], 1);
			}
			
		}
		for(Entry<String, Integer> data:map.entrySet()) {
			
			String key= data.getKey();
			Integer value=data.getValue();
			if(value>1) {
				System.out.println(key);
			}
			
		}
		
		
		
	}

}
