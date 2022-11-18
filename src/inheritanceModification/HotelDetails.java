package inheritanceModification;

import java.text.DecimalFormat;

public class HotelDetails extends UserDetails {
	private double childMealPrice = 5;
	private double adultMealPrice = 25;
	private double totalAdultMealPrice;
	private double totalChildMealPrice;
	private String mealOption;
	private int numberOfAdults = 0;
	int numberOfChildren;
	int numberOfDays = 0;
	private String typeOfRoom;
	private int maximumNoOfAdultsAllowed;
	private int maximumNoOfChildAllowed;
	private double roomCost;
	DecimalFormat df = new DecimalFormat("0.00");

	public HotelDetails(String typeOfRoom, int maximumNoOfAdultsAllowed, int maximumNoOfChildAllowed, double roomCost) {
		this.typeOfRoom = typeOfRoom;
		this.maximumNoOfAdultsAllowed = maximumNoOfAdultsAllowed;
		this.maximumNoOfChildAllowed = maximumNoOfChildAllowed;
		this.roomCost = roomCost;
	}

	public HotelDetails() {
		super();
	}

	public String getTypeOfRoom() {
		return typeOfRoom;
	}

	public double getRoomCost() {
		return roomCost;
	}

	String hotelUserChoice() {
		System.out.println("Please enter the room you want to select\r\n"
				+ "Delux_Suite: accommodates 2 adults and 2 children at the rate of $180/ night\r\n"
				+ "Family_Suite: accommodates 4 adults and 4 children at $230/ night.\r\n" + ""
				+ "Enter your choice of suite");
		String typeOfSuiteEntered = sc.next();
		return typeOfSuiteEntered;
	}

	void getNoOfAdults(int maxNumberOfAdults) {
		do {
			System.out.println("Enter the number of adults");
			numberOfAdults = sc.nextInt();
			if (numberOfAdults > maxNumberOfAdults) {
				System.out.println("Only " + maxNumberOfAdults + " adults are allowed in this type of suite. ");
			}
		} while ((numberOfAdults == 0) || (numberOfAdults > maxNumberOfAdults));
	}

	void getNoOfChildrenAbove5(int maxNumberofChildren) {
		do {
			System.out.println("Enter the number of children");
			numberOfChildren = sc.nextInt();
			if (numberOfChildren > maxNumberofChildren) {
				System.out.println("Only " + maxNumberofChildren + " children are allowed in this type of suite");
			}
		} while (numberOfChildren > maxNumberofChildren);
	}

	void getNumberOfDaysRequired() {
		System.out.println("How many days do you want to stay?");
		numberOfDays = sc.nextInt();
	}

	double calculateRoomCost(double roomCost) {
		double totalRoomCost = (roomCost * numberOfDays);
		return totalRoomCost;
	}

	public int getMaximumNoOfAdultsAllowed() {
		return maximumNoOfAdultsAllowed;
	}

	public int getMaximumNoOfChildAllowed() {
		return maximumNoOfChildAllowed;
	}

	double calculateAdultMealPrice() {
		totalAdultMealPrice = adultMealPrice * numberOfAdults * numberOfDays;
		return totalAdultMealPrice;
	}

	double calculateChildMealPrice() {
		totalChildMealPrice = 0;
		totalChildMealPrice = childMealPrice * numberOfChildren * numberOfDays;
		return totalChildMealPrice;
	}

	double mealOptionCost() {
		double totalMealPrice = 0;
		System.out.println(
				"All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child"
						+ " Press Y to select and N to go to the final price");
		mealOption = sc.next();
		if (mealOption.equalsIgnoreCase("y")) {
			totalMealPrice = calculateAdultMealPrice() + calculateChildMealPrice();
		}
		return totalMealPrice;

	}

	double calculateHST(double roomCost, double mealCost) {
		double hstCalculated = (roomCost + mealCost) * 0.18;
		return hstCalculated;
	}

	double calculateTotalCost(double roomCost, double mealCost, double hst) {
		double totalPrice = roomCost + mealCost + hst;
		return totalPrice;
	}

	public HotelDetails getHotelRoomSelected(HotelDetails[] hotel, String typeOfHotelEntered) {
		int i;
		HotelDetails hotelSelected = null;
		for (i = 0; i < hotel.length; i++) {
			if (hotel[i].typeOfRoom.equalsIgnoreCase(typeOfHotelEntered)) {
				hotelSelected = hotel[i];
				break;
			}
		}
		return hotelSelected;
	}

	void totalCost(double roomCost, double mealCost, double calculateHST, double totalPriceAfterTax,
			String typeOfSuite) {
		System.out.println("Your Package includes:");
		System.out.println(typeOfSuite + " @  " + numberOfDays + " : " + roomCost);
		if (mealOption.equalsIgnoreCase("y")) {
			System.out.println("Meal Special Price Adults \t@  " + numberOfAdults + " : " + totalAdultMealPrice);
		}
		if (mealOption.equalsIgnoreCase("y")) {
			System.out.println("Meal Special Price Kids\t@  " + numberOfChildren + " : " + totalChildMealPrice);
		}
		System.out.println("Total Price \t\t\t: " + df.format((roomCost + mealCost)));
		System.out.println("HST @ 18% \t\t\t: " + df.format(calculateHST));
		System.out.println("Final Price \t\t\t: " + df.format(totalPriceAfterTax));
	}

}
