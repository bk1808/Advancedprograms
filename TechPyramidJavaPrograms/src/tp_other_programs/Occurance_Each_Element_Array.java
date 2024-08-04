package tp_other_programs;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Occurance_Each_Element_Array {

	public static void main(String[] args) {

		int a[] = {1,1,2,3,2,4,1,5};
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for(int i=0 ; i<a.length ; i++) {
			
			int digit = a[i];
			if(map.containsKey(digit)) {
				map.put(digit, map.get(digit)+1);
			}
			else {
				map.put(digit, 1);
			}
			
		}
		System.out.println("Number of occurance of each element: ");
		for(Entry<Integer, Integer>dataSet:map.entrySet()) {
			
			System.out.println(dataSet);
			
		}
		
		System.out.println("Only Duplicate elements: ");
		for(Entry<Integer, Integer> data:map.entrySet()) {
			
			if(data.getValue()>1) {
				
				System.out.println(data.getKey());
				
			}
			
		}
		System.out.println("Print only Unique elements: ");
		for(Entry<Integer, Integer>unique:map.entrySet()) {
			
			Integer key = unique.getKey();
			Integer value = unique.getValue();
			
			if(value==1) {
				System.out.println(key+"=="+value);
			}
			
		}
		System.out.println("Remove duplicate elements: ");
		Set<Integer> keySet = map.keySet();
		for(Integer key:keySet) {
			
			System.out.println(key);
			
		}
		
		
		//print only duplicate elements of the given array
		//print only unique elements in the given array
		//remove duplicate elements
		//without using the length function or length variable reverse the string
		//why string is immutable
		
		
	}

}
