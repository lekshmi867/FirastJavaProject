/*Write a program that will keep adding 5 chocolates to a box which already has 27 chocolates 
 * and add a mechanism that number of chocolates should never go above 63
*/
public class ChocolateBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chocolateInBox = 27;

		System.out.println("Initial count of chocolates in the box =  " + chocolateInBox);

		while(chocolateInBox<=80) {
			if(chocolateInBox>=62) {
			System.out.println("Box is full " +chocolateInBox);
			break;
			}
			else {
				chocolateInBox = chocolateInBox + 5;
			}
			System.out.println("chocolate in box = "+chocolateInBox);
		}
		

	}

}
