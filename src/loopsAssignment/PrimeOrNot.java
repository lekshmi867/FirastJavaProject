/*Write a program to check if the number is prime or not.*/

package loopsAssignment;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num = 7, i, f = 0;

		if ((num == 0) || (num == 1)) {
			f = 1;
		} else {
			for (i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					f = 1;
					break;
				}
			}
		}

		if (f == 1) {
			System.out.println("Number " + num + " is not a prime number");
		} else {
			System.out.println("Number " + num + " is a prime number");
		}
	}

}
