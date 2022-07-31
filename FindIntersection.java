package week3.day2.Assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		 //Declare An array for {3,2,11,4,6,7};	 
		 // Declare another array for {1,2,8,4,9,7};
		 // Declare for loop iterator from 0 to array length
		 // Declare a nested for another array from 0 to array length
		 // Compare Both the arrays using a condition statement
		 //Print the first array (should match item in both arrays)
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};

		List<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					arrayList.add(array1[i]);
				}
			}
		}
		Collections.sort(arrayList);
		System.out.println("Intersection of two arrays are: " + arrayList);
	}

}
