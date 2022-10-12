/*Write a program to prepare the bill for a pizza shop.
Assume an order and work out the final bill.
Take the Cheese Pizza prices as: Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
For additional pepperoni topping: Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
Extra cheese for any size pizza: + $1
For eg: If the Pizza is medium, pepperoni with extra cheese the program should calculate the final bill as 20+3+1 = $24 and print as
“Your final bill is $24 */

import java.util.Scanner;

public class PizzaShopBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String selectPizza = "SMALL".toLowerCase();
		int f = 0, bill = 0;
		String morePizza;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Select the pizza size amll, medium, large");
			String selectPizza = sc.nextLine().toLowerCase();
			System.out.println("Do you want to add pepporini press y to continue");
			String addPepporoni = sc.nextLine().toLowerCase();
			System.out.println("Do you want to add extra cheese press y to continue");
			String addExtraCheese = sc.nextLine().toLowerCase();

			if (selectPizza.equals("small")) {
				bill = bill + 15;
			} else if (selectPizza.equals("medium")) {
				bill = bill + 20;
			} else if (selectPizza.equals("large")) {
				bill = bill + 25;
			} else {
				f = 1;
			}

			if (addPepporoni.equals("y")) {
				if (selectPizza.equals("small")) {
					bill = bill + 2;
				} else if ((selectPizza.equals("large")) || (selectPizza.equals("medium"))) {
					bill = bill + 3;
				} else {
					f = 1;
				}
			}

			if (addExtraCheese.equals("y")) {
				if ((selectPizza.equals("large")) || (selectPizza.equals("medium")) || (selectPizza.equals("small"))) {
					bill = bill + 1;
				} else {
					f = 1;
				}
			}

			if (f == 0) {
				System.out.println("Final bill after selecting the extra options $" + bill);
			} else {
				System.out.println("Nothing added to cart and total amount is $" + bill);
			}

			System.out.println("Do you want to order more pizza press y to continue");
			morePizza = sc.nextLine();
			sc.close();
		} while (morePizza.equals("y"));

		System.out.println("Total amount is $" + bill);

	}
}
