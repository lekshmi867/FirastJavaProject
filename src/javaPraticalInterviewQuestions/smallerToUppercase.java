package javaPraticalInterviewQuestions;
import java.util.Scanner;

public class smallerToUppercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String enteredString = sc.nextLine();
		
		System.out.println("Entered string in uppercase is "+enteredString.toUpperCase());

	}

}
