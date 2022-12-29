package javaPraticalInterviewQuestions;

import java.util.Arrays;

public class removeLastElementFromString {

	public static void main(String[] args) {
	String enteredString = "This is an interview";
	String[] stringArray = enteredString.split(" ");
	for (int i = 0; i < stringArray.length; i++) {
		System.out.println(stringArray[i].substring(1,stringArray[i].length()-1));
	}
	}

}
