package week3.day2.Assign;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pseudo code 
		 
		  // Use the declared String text as input
		 //String text = "We learn java basics as part of java sessions in java week1";		
		 //Initialize an integer variable as count	  
		 //Split the String into array and iterate over it 
		 //Initialize another loop to check whether the word is there in the array
		 //if it is available then increase and count by 1. 
		 // if the count > 1 then replace the word as "" 
		 //Displaying the String without duplicate words
		    String text = "We learn java basics as part of java sessions in java week1";
			String[] str = text.split(" ");
			Set<String> uniquestr = new LinkedHashSet<String>();
			for (int i = 0; i < str.length; i++) 
			{
				uniquestr.add(str[i]); //only unique string be added
			}
			String str1 = String.join(" ", uniquestr);//joins the string with the given delimiter
			System.out.println(str1);
		 
	}

}
