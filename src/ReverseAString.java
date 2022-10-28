import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String newString = sc.next();
		String reverseString = "";
		char ch;

		for (int i = newString.length()-1; i >=0; i--) {
			ch = newString.charAt(i);
			reverseString = reverseString + ch;
		}
		System.out.println(reverseString);
		
		if(newString.equals(reverseString)) {
			System.out.println("The string is a palindrome");
		}else
		{
			System.out.println("The string is not a palindrome");
		}

	}

}
