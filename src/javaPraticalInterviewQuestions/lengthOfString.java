package javaPraticalInterviewQuestions;
import java.util.Scanner;

public class lengthOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String stringEntered = sc.next();
		char[] charArray = stringEntered.toCharArray();
		int len =0;
		for (char c : charArray) {
			len++;
		}
		System.out.println("Length of the string is " + len);
	}

}
