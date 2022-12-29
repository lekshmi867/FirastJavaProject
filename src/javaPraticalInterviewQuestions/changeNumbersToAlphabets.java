package javaPraticalInterviewQuestions;

import java.util.Arrays;

public class changeNumbersToAlphabets {

	public static void main(String[] args) {
		int[] numberArray = {7,9,10,11,4};
		char[] charArray = new char[numberArray.length]; 
		char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		
		for (int i = 0; i < numberArray.length; i++) {
			if(numberArray[i]<=26) {
				int value = numberArray[i];
				charArray[i]=alphabets[value-1];
			}
		}
		System.out.println(Arrays.toString(charArray));
		

}
}