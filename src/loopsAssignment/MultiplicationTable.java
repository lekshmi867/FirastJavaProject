/*Write a program which prints the multiplication table of a number.
*/

package loopsAssignment;

public class MultiplicationTable {

	public static void main(String[] args) {
		int num = 5, i, result;

		System.out.println("Multiplication Table for number " + num);
		for (i = 1; i <= 10; i++) {
			result = num * i;
			System.out.println(num + " * " + i + " = " + result);
		}
	}

}
