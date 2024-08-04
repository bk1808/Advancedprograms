package tp_other_programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class LearningEntrySet {
//Entry Set can be used only with Generic collection
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("Dhoni", 7);
		map.put("VK", 18);
		map.put("RS", 45);
		map.put("SKY", 63);
		
		
		for(Entry<String, Integer> data:map.entrySet()) {
			String key=data.getKey();
			int value=data.getValue();
			System.out.println(key+"=="+value);
		}
	}

}
