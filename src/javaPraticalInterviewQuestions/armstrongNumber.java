package javaPraticalInterviewQuestions;

import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {
		int reminder, result=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int savedNumber = number;
		while(number>0) {
			reminder = number%10;
			result = (int) (result + Math.pow(reminder, 3));
			number = number/10;
		}
		if(result==savedNumber) {
			System.out.println("The number "+savedNumber+" is a armstrong number");
		}
		else {
			System.out.println("The number "+savedNumber+" is not a armstrong number");
		}

	}

}
