/*Write a program to prepare the bill for a pizza shop.
Assume an order and work out the final bill.
Take the Cheese Pizza prices as: Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
For additional pepperoni topping: Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
Extra cheese for any size pizza: + $1
For eg: If the Pizza is medium, pepperoni with extra cheese the program should calculate the final bill as 20+3+1 = $24 and print as
“Your final bill is $24 */

package loopsAssignment;

public class PizzaShopBill {

	public static void main(String[] args) {
		String selectPizza = "small";
		int f = 0;

		boolean addPepporoni = false;
		boolean addExtraCheese = true;
		int bill = 0;

		if (selectPizza.equals("small")) {
			bill = bill + 15;
			System.out.println("Pizza:			$" + bill);
		} else if (selectPizza.equals("medium")) {
			bill = bill + 20;
			System.out.println("Pizza: 			$" + bill);
		} else if (selectPizza.equals("large")) {
			bill = bill + 25;
			System.out.println("Pizza: 			$" + bill);
		} else {
			f = 1;
		}

		if (addPepporoni) {
			if (selectPizza.equals("small")) {
				System.out.println("Pepporoni:		$2");
				bill = bill + 2;
			} else if ((selectPizza.equals("large")) || (selectPizza.equals("medium"))) {
				System.out.println("Pepporoni:		$3");
				bill = bill + 3;
			} else {
				f = 1;
			}
		}

		if (addExtraCheese) {
			if ((selectPizza.equals("large")) || (selectPizza.equals("medium")) || (selectPizza.equals("small"))) {
				System.out.println("Extra cheese:		$1");
				bill = bill + 1;
			} else {
				f = 1;
			}
		}

		if (f == 0) {
			System.out.println("Total Amount :		$" + bill);
		} else {
			System.out.println("Nothing added to cart and total amount is $" + bill);
		}
	}

}
