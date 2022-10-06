/*Write a program to prepare the bill for a pizza shop.
Assume an order and work out the final bill.
Take the Cheese Pizza prices as: Small Pizza: $15, Medium Pizza: $20, Large Pizza: $25
For additional pepperoni topping: Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
Extra cheese for any size pizza: + $1
For eg: If the Pizza is medium, pepperoni with extra cheese the program should calculate the final bill as 20+3+1 = $24 and print as
“Your final bill is $24 */

public class Pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String selectPizza = "";

		boolean addPepporoni = true;
		boolean addExtraCheese = true;
		int bill=0;
		
		
		if(selectPizza.equals("small")) {
			bill = bill + 15;
			if(addPepporoni) {
				bill = bill+ 2;
				if(addExtraCheese) {
					bill = bill +1;
				}
			
			}
		}
		else if(selectPizza.equals("medium")) {
				bill = bill + 20;
				if(addPepporoni) {
					bill = bill+ 3;
					if(addExtraCheese) {
						bill = bill +1;
					}
				
				}
			
		}
		else {
				bill = bill + 25;
				if(addPepporoni) {
					bill = bill+ 3;
					if(addExtraCheese) {
						bill = bill +1;
					}
				
				}
			
		}
		
		System.out.println("final bill = $"+bill);
		

	}

}
