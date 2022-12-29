package javaPraticalInterviewQuestions;
import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String stringToreverse = sc.nextLine();
		String reverseString = "";
		for (int i = 0; i <stringToreverse.length(); i++) {
			char ch = stringToreverse.charAt(i);
			reverseString = ch + reverseString;
			
		}
		System.out.println("reversed String is "+ reverseString);
		if(stringToreverse.equals(reverseString)) {
			System.out.println("The string is a palindrome");
		}else
		{
			System.out.println("The string is not a palindrome");
		}

	}

}
