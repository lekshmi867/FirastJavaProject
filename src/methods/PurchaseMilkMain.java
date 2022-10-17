package methods;

import java.util.Scanner;

public class PurchaseMilkMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of milk packets to purchase");
		int numberOfPacketsEntered = sc.nextInt();
		MilkAvaliable milkAvailable = new MilkAvaliable();
		System.out.println("Milk Available " + milkAvailable.isMilkAvailablein(numberOfPacketsEntered));

	}

}
