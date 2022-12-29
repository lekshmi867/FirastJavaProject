package javaPraticalInterviewQuestions;
import java.util.Scanner;

public class factorialOfNumber {

	public static void main(String[] args) {
		int f=1, num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		for (int i = 1; i <=num; i++) {
			f = f*i;
		}
		System.out.println("Factorial is "+f);
	}

}
