package inheritanceModification;

import java.text.DecimalFormat;

public class CruiseDetails extends UserDetails {
	private double childBuffetPrice = 4.99;
	private double adultBuffetPrice = 20.99;
	private double totalAdultBuffetPrice;
	private double totalChildBuffetPrice;
	private int countOfChidAboveFive = 0;
	private String buffetChoice;
	private int numberOfAdults;
	private int ageOfChild;
	private double totalPrice;
	public String getTypeOfCruise() {
		return typeOfCruise;
	}
	public double getTicketCostOfAdult() {
		return ticketCostOfAdult;
	}
	public double getTicketCostOfChild() {
		return ticketCostOfChild;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}

	private int numberOfChildren;
	public String typeOfCruise;
	private double ticketCostOfAdult;
	private double ticketCostOfChild;
	private int numberOfDays;
	DecimalFormat df = new DecimalFormat("0.00");

	public CruiseDetails(String typeOfCruise, double ticketCostOfAdult, double ticketCostOfChild, int numberOfDays) {
		this.typeOfCruise = typeOfCruise;
		this.ticketCostOfAdult = ticketCostOfAdult;
		this.ticketCostOfChild = ticketCostOfChild;
		this.numberOfDays = numberOfDays;
	}
	public CruiseDetails() {
		super();
	}

	String cruiseUserChoice() {

		System.out.println(
				"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.\r\n" + "Scenic_Cruise\r\n" + "Sunset_Cruise\r\n" + "Discovery_Cruise\r\n" + "Mystery_Cruise\r\n" + "Enter your choice");
		String typeOfCruiseEntered = sc.next();
		return typeOfCruiseEntered;
	}

	int getNoOfAdults() {
		do {
			System.out.println("Enter the number of adults");
			numberOfAdults = sc.nextInt();
		} while (numberOfAdults == 0);
		return numberOfAdults;
	}

	double calculateTotalTicketCostForAdults(double ticketCostOfAdult, int numberOfDays) {
		int noOfAdult = getNoOfAdults();
		double totalticketCostOfAdult = (ticketCostOfAdult * noOfAdult * numberOfDays);
		return totalticketCostOfAdult;
	}

	int getNoOfChildrenAbove5() {
		System.out.println("Enter the number of children");
		numberOfChildren = sc.nextInt();
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
		return countOfChidAboveFive;
	}

	double totalTicketCostForChild(double ticketCostOfChild, int numberOfDays) {

		int countOfChidAboveFive = getNoOfChildrenAbove5();
		double totalTicketCostOfChild = (ticketCostOfChild * numberOfDays * countOfChidAboveFive);
		return totalTicketCostOfChild;

	}

	double calculateAdultBuffetPrice(int numberOfDays) {
		totalAdultBuffetPrice = adultBuffetPrice * numberOfAdults * numberOfDays;
		return totalAdultBuffetPrice;
	}

	double calculateChildBuffetPrice(int numberOfDays) {
		totalChildBuffetPrice = 0;
		totalChildBuffetPrice = childBuffetPrice * countOfChidAboveFive * numberOfDays;
		return totalChildBuffetPrice;
	}

	double buffetOptionCost(int numberOfDays) {
		double totalBuffetPrice = 0;
		System.out.println(
				"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?"
						+ " Press Y to select and N to go to the final price");
		buffetChoice = sc.next();
		if (buffetChoice.equalsIgnoreCase("y")) {
			totalBuffetPrice = calculateAdultBuffetPrice(numberOfDays) + calculateChildBuffetPrice(numberOfDays);
		}
		return totalBuffetPrice;

	}

	double calculateHST(double adultCost, double childCost, double buffetCost, double optionalServiceCost) {
		double hstCalculated = (adultCost + childCost + buffetCost + optionalServiceCost) * 0.15;
		return hstCalculated;
	}

	double calculateTotalCost(double adultCost, double childCost, double buffetCost, double optionalServiceCost,
			double hst) {
		totalPrice = adultCost + childCost + buffetCost + optionalServiceCost + hst;
		return totalPrice;
	}

	void totalCost(double costOfAdults, double costOfChildren, double buffetCost, double costOfOptionalservice,
		 double calculateHST, double totalPriceAfterTax, String typeOfCruise) {
		System.out.println("Your Package includes:");
		System.out.println(typeOfCruise + " Adults\t\t@  " + numberOfAdults + " : " + costOfAdults);
		if ((numberOfChildren > 0) && (countOfChidAboveFive > 0)) {
			System.out.println(typeOfCruise + " kids\t\t@  " + countOfChidAboveFive + " : " + costOfChildren);
		}
		if (buffetChoice.equalsIgnoreCase("y")) {
			System.out.println("Buffet Special Price Adults \t@  " + numberOfAdults + " : " + totalAdultBuffetPrice);
		}
		if ((buffetChoice.equalsIgnoreCase("y")) && (countOfChidAboveFive > 0)) {
			System.out.println("Buffet Special Price Kids\t@  " + countOfChidAboveFive + " : " + totalChildBuffetPrice);
		}
		System.out.println("Cost of optional service \t\t\t: " + df.format(costOfOptionalservice));
		System.out.println("Total Price \t\t\t: "
				+ df.format((costOfAdults + costOfChildren + buffetCost + costOfOptionalservice)));
		System.out.println("HST @ 15% \t\t\t: " + df.format(calculateHST));
		System.out.println("Final Price \t\t\t: " + df.format(totalPriceAfterTax));
	}

	public CruiseDetails displayCruiseTypes(CruiseDetails[] cruise, String typeOfCruiseEntered) {
		int i;
		for (i = 0; i < cruise.length; i++) {
			if (cruise[i].typeOfCruise.equalsIgnoreCase(typeOfCruiseEntered)) {
				System.out.println("The cruise that you have selected is " + cruise[i].typeOfCruise + " which is a " + cruise[i].numberOfDays + " day cruise");
				System.out.println("Price for Adults(greater than 12) per day    : " + cruise[i].ticketCostOfAdult);
				System.out.println("Price for kids above 5 per day               : " + cruise[i].ticketCostOfChild);
				break;
			}
		}
		return cruise[i];
	}
	

}
