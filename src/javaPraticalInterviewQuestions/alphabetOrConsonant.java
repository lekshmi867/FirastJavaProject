package javaPraticalInterviewQuestions;

import java.util.Scanner;

public class alphabetOrConsonant {

	public static void main(String[] args) {
		System.out.println("Enter the character");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().toLowerCase().charAt(0);
		//char ch = 'i';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

	}

}
