/*Write a program that will keep adding 5 chocolates to a box which already has 27 chocolates 
 * and add a mechanism that number of chocolates should never go above 63
*/

package loopsAssignment;

public class ChocolateBox {

	public static void main(String[] args) {
		int chocolateInBox = 27;
		int i;

		System.out.println("Initial count of chocolates in the box =  " + chocolateInBox);

		for (i = 1; i < 20; i++) {

			chocolateInBox = chocolateInBox + 5;
			System.out.println("After iteration " + i + " count in the box =" + chocolateInBox);

			if (chocolateInBox >= 62) {
				System.out.println("Number of chocolates in the box reached the maximum limit");
				break;
			}
		}
		System.out.println("Total number of chocolates in the box = " + chocolateInBox);

	}

}
