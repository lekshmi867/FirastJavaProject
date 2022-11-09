package inheritanceAssignment;

import java.text.DecimalFormat;

public class HotelDetails extends CruiseUser {
	private double totalRoomCost = 0.0;
	private double childMealPrice = 5;
	private double adultMealPrice = 25;
	private double totalAdultMealPrice;
	private double totalChildMealPrice;
	private int countOfChidAboveFive = 0;
	private int typeOfSuiteEntered;
	private String mealOption;
	private int numberOfAdults;
	private int ageOfChild;
	double totalPrice;
	int numberOfChildren;
	int numberOfDays =0;
	DecimalFormat df = new DecimalFormat("0.00");

	int hotelUserChoice() {

		System.out.println(
				"Please enter the room you want to select\r\n"
				+ "1. Delux Suite: accommodates 2 adults and 2 children at the rate of $180/ night\r\n"
				+ "2. Family Suite: accommodates 4 adults and 4 children at $230/ night.\r\n"
				+ "" + "Enter your choice of suite");

		typeOfSuiteEntered = sc.nextInt();
		return typeOfSuiteEntered;
	}

	
	void getNoOfAdults(int maxNumberOfAdults) {
		do {
			System.out.println("Enter the number of adults");
			numberOfAdults = sc.nextInt();
			if(numberOfAdults>maxNumberOfAdults) {
				System.out.println("Only "+maxNumberOfAdults+ " adults are allowed in this type of suite. ");
			}
		} while ((numberOfAdults == 0)||(numberOfAdults>maxNumberOfAdults));
	}
	
	void getNoOfChildrenAbove5(int maxNumberofChildren) {
		do {
		System.out.println("Enter the number of children");
		numberOfChildren = sc.nextInt();
		if(numberOfChildren>maxNumberofChildren) {
			System.out.println("Only "+maxNumberofChildren+ " children are allowed in this type of suite");
		}
		}while(numberOfChildren>maxNumberofChildren);
		for (int j = 1; j <= numberOfChildren; j++) {
			do {
				System.out.println("Enter the age of child " + j);
				ageOfChild = sc.nextInt();
				if (ageOfChild > 5) {
					countOfChidAboveFive++;
				}
				if (ageOfChild > 12) {
					System.out.println("Please enter child age below 12");		
				}
			} while (ageOfChild > 12);
		
	}
	}
	
	void getNumberOfDaysRequired() {
		System.out.println("How many days you want to book the room?");
		numberOfDays = sc.nextInt();
	}

	double calculateRoomCost(double roomCost) {
		totalRoomCost = (roomCost * numberOfDays);
		return totalRoomCost;
	}
	
	
	private boolean isMealRequired() {
		System.out.println(
				"All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child"
						+ " Press Y to select and N to go to the final price");
		mealOption = sc.next();
		if (mealOption.equalsIgnoreCase("y")) {
			return true;
		} else if (mealOption.equalsIgnoreCase("n")) {
			System.out.println("You have not selected the meal option");
		} else {
			System.out.println("Invalid Option selected");
		}
		return false;
	}
	
	double calculateAdultMealPrice() {
		totalAdultMealPrice = adultMealPrice * numberOfAdults * numberOfDays;
		return totalAdultMealPrice;
	}
	
	double calculateChildMealPrice() {
		totalChildMealPrice = 0;
		totalChildMealPrice = childMealPrice * countOfChidAboveFive * numberOfDays;
		return totalChildMealPrice;
	}

	double  mealOptionCost() {
		double totalMealPrice=0;
		if(isMealRequired()) {
			totalMealPrice = calculateAdultMealPrice()+calculateChildMealPrice();
		}
		return totalMealPrice;
		
	}
	
	double calculateHST(double roomCost, double mealCost) {
		double hstCalculated = (roomCost+mealCost)*0.18;
		return hstCalculated;
	}
	
	double calculateTotalCost(double roomCost, double mealCost, double hst) {
		totalPrice = roomCost+mealCost+hst;
		return totalPrice;
	}
	
	

	void totalCost(double roomCost, double mealCost, double calculateHST, double totalPriceAfterTax, String typeOfSuite) {
		System.out.println("Your Package includes:");
		System.out.println(typeOfSuite + " @  " + numberOfDays + " : " + roomCost);
		if (mealOption.equalsIgnoreCase("y")) {
			System.out.println("Meal Special Price Adults \t@  " + numberOfAdults + " : " + totalAdultMealPrice);
		}
		if ((mealOption.equalsIgnoreCase("y")) && (countOfChidAboveFive > 0)) {
			System.out.println("Meal Special Price Kids\t@  " + countOfChidAboveFive + " : " + totalChildMealPrice);
		}
		System.out.println("Total Price \t\t\t: " + df.format((roomCost+mealCost)));
		System.out.println("HST @ 18% \t\t\t: " + df.format(calculateHST));
		System.out.println("Final Price \t\t\t: " + df.format(totalPriceAfterTax));
	}

}
