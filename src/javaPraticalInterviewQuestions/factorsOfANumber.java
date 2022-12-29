package javaPraticalInterviewQuestions;

import java.util.Scanner;

public class factorsOfANumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("Factors of the number "+number+" are");
		for (int i = 1; i <=number; i++) {
			if(number%i==0) {
				System.out.println(i);
			}
			
		}

	}

}
