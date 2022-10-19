package constructorAssignment;

public class CruiseDetails {
	String typeOfCruise;
	double ticketCostOfAdult;
	double ticketCostOfChild;
	int numberOfDays;
	double totalticketCostOfAdult = 0.0;
	double totalTicketCostOfChild = 0.0;
	double childBuffetPrice = 4.99;
	double adultBuffetPrice = 20.99;
	double totalAdultBuffetPrice;
	double totalChildBuffetPrice;
	int countOfChidAboveFive = 0;

	CruiseDetails(String modelOfCruise, double tktCostOfAdult, double tktCostOfChild, int noOfDays) {
		typeOfCruise = modelOfCruise;
		ticketCostOfAdult = tktCostOfAdult;
		ticketCostOfChild = tktCostOfChild;
		numberOfDays = noOfDays;
	}

	void totalCostForAdults(int noOfAdult) {
		totalticketCostOfAdult = totalticketCostOfAdult + (ticketCostOfAdult * noOfAdult * numberOfDays);
	}

	void totalCostForChild(int ageOfChild) {
		if (ageOfChild > 5) {
			totalTicketCostOfChild = totalTicketCostOfChild + (ticketCostOfChild * numberOfDays);
			countOfChidAboveFive++;
		} else {
			totalTicketCostOfChild = totalTicketCostOfChild + 0;
		}

	}

	void buffetOption(int noOfAdults) {
		totalAdultBuffetPrice = adultBuffetPrice * noOfAdults * numberOfDays;
		totalChildBuffetPrice = childBuffetPrice * countOfChidAboveFive * numberOfDays;
	}

	void totalCost(int noOfAdults, int noOfChild, String buffetChoice) {
		double totalAmount = totalticketCostOfAdult + totalTicketCostOfChild + totalAdultBuffetPrice
				+ totalChildBuffetPrice;
		double totalHST = totalAmount * 0.15;
		System.out.println("Your Package includes:");
		System.out.println(typeOfCruise + " Adults\t\t@  " + noOfAdults + " : " + totalticketCostOfAdult);
		if ((noOfChild > 0) && (countOfChidAboveFive > 0)) {
			System.out
					.println(typeOfCruise + " kids\t\t@  " + countOfChidAboveFive + " : " + totalTicketCostOfChild);
		}
		if (buffetChoice.equalsIgnoreCase("y")) {
			System.out.println("Buffet Special Price Adults \t@  " + noOfAdults + " : " + totalAdultBuffetPrice);
		}
		if ((buffetChoice.equalsIgnoreCase("y"))&&(countOfChidAboveFive>0)) {
			System.out
					.println("Buffet Special Price Kids\t@  " + countOfChidAboveFive + " : " + totalChildBuffetPrice);
		}
		System.out.println("Total Price \t\t\t: " + totalAmount);
		System.out.println("HST @ 15% \t\t\t: " + totalHST);
		System.out.println("Final Price \t\t\t: " + (totalAmount + totalHST));
	}

}
