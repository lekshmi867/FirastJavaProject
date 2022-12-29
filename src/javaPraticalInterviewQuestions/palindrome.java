package javaPraticalInterviewQuestions;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int reminder, sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int savedNumber = number;
		while(number>0) {
			reminder = number%10;
			sum=(sum*10)+reminder;
			number=number/10;	
		}
		
		if(sum==savedNumber) {
			System.out.println("The number "+savedNumber+" is a palidrome");
		}
		else {
			System.out.println("The number "+savedNumber+" is not a palidrome");
		}
	}

}
