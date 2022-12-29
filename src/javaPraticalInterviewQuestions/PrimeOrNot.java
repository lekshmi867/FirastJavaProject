package javaPraticalInterviewQuestions;

/*Write a program to check if the number is prime or not.*/
public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12;
		boolean isPrime = true;

		if ((num == 1) || (num == 0)) {
			 isPrime = false;
		} else {
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					 isPrime = false;
					 break;
				}
			}
		}

		if ( isPrime ) {
			System.out.println("Number " + num + " is a prime number");
		} else {
			System.out.println("Number " + num + " is not a prime number");
		}

	}

}
