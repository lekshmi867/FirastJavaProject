import java.util.Scanner;

public class AdditionOfThreeNumbers {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number ");
		num1 = sc.nextInt();

		System.out.println("Enter the second number ");
		num2 = sc.nextInt();

		System.out.println("Enter the third number ");
		num3 = sc.nextInt();

		int num4 = num1 + num2 + num3;

		System.out.println("The result is " + num4);

	}

}
