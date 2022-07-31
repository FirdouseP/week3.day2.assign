package week3.day2.Assign;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Map -> TreeMap
		// For loop -> each number -> add to the map
		 //If it is exist -> update it with + 1
		 //Else -> new entry with 1 as value
		
		int[] numbers = {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				map.put(numbers[i], map.get(numbers[i])+1); // update entry to map

			}else {
				map.put(numbers[i],1); // new entry to map
			}
		}
		System.out.println(map);
	}

}
