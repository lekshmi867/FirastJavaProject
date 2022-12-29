package javaPraticalInterviewQuestions;

import java.util.Arrays;

public class anagramOrNot {

	public static void main(String[] args) {
		String firstString = "mode".toLowerCase();
		String secondString = "Dome".toLowerCase();
		
		char[] firstCharArray = firstString.toCharArray();
		char[] secondArray = secondString.toCharArray();
		
		Arrays.sort(firstCharArray);
		Arrays.sort(secondArray);
		
		
		System.out.println(firstCharArray);
		System.out.println(secondArray);
		
		if(Arrays.toString(firstCharArray).equals(Arrays.toString(secondArray))) {
			System.out.println("It is an anagram");
		}else {
			System.out.println("It is not an anagram");
		}
		

	}

}
