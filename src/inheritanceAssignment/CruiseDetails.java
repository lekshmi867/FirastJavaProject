package inheritanceAssignment;
import java.text.DecimalFormat;

public class CruiseDetails extends UserDetails {
	private double totalticketCostOfAdult = 0.0;
	private double totalTicketCostOfChild;
	private double childBuffetPrice = 4.99;
	private double adultBuffetPrice = 20.99;
	private double totalAdultBuffetPrice;
	private double totalChildBuffetPrice;
	private int countOfChidAboveFive = 0;
	private int typeOfCruiseEntered;
	private String buffetChoice;
	private int numberOfAdults;
	private int ageOfChild;
	private double totalPrice;
	private int numberOfChildren;
	DecimalFormat df = new DecimalFormat("0.00");

	int cruiseUserChoice() {

		System.out.println(
				"We offer 4 different packages as displayed below. Please enter the cruise that you want to select.\r\n"
						+ "1.Scenic Cruise\r\n" + "2.Sunset Cruise\r\n" + "3.Discovery Cruise\r\n"
						+ "4.Mystery Cruise\r\n" + "Enter your choice from 1-4");

		typeOfCruiseEntered = sc.nextInt();
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
		totalticketCostOfAdult = (ticketCostOfAdult * noOfAdult * numberOfDays);
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
			totalTicketCostOfChild =(ticketCostOfChild * numberOfDays*countOfChidAboveFive);
			return totalTicketCostOfChild;

	}
	
	
	private boolean isBuffetRequired() {
		System.out.println(
				"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?"
						+ " Press Y to select and N to go to the final price");
		buffetChoice = sc.next();
		if (buffetChoice.equalsIgnoreCase("y")) {
			return true;
		} else if (buffetChoice.equalsIgnoreCase("n")) {
			System.out.println("You have not selected the buffet option");
		} else {
			System.out.println("Invalid Option selected");
		}
		return false;
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

	double  buffetOptionCost(int numberOfDays) {
		double totalBuffetPrice=0;
		if(isBuffetRequired()) {
			totalBuffetPrice = calculateAdultBuffetPrice(numberOfDays)+calculateChildBuffetPrice(numberOfDays);
		}
		return totalBuffetPrice;
		
	}
	
	double calculateHST(double adultCost, double childCost, double buffetCost, double optionalServiceCost) {
		double hstCalculated = (adultCost+childCost+buffetCost+optionalServiceCost)*0.15;
		return hstCalculated;
	}
	
	double calculateTotalCost(double adultCost, double childCost, double buffetCost, double optionalServiceCost, double hst) {
		totalPrice = adultCost+childCost+buffetCost+optionalServiceCost+hst;
		return totalPrice;
	}
	
	

	void totalCost(double costOfAdults, double costOfChildren, double buffetCost, double costOfOptionalservice,int numberOfOptionalService, double calculateHST, double totalPriceAfterTax, String typeOfCruise) {
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
		System.out.println("Total Price \t\t\t: " + df.format((costOfAdults+costOfChildren+buffetCost+costOfOptionalservice)));
		System.out.println("HST @ 15% \t\t\t: " + df.format(calculateHST));
		System.out.println("Final Price \t\t\t: " + df.format(totalPriceAfterTax));
	}

}
