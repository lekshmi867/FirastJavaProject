package encapsulationAssignment;

import java.text.DecimalFormat;

public class CruiseDetails {
	private String typeOfCruise;
	private double ticketCostOfAdult;
	private double ticketCostOfChild;
	private int numberOfDays;
	private double totalticketCostOfAdult = 0.0;
	private double totalTicketCostOfChild = 0.0;
	private double childBuffetPrice = 4.99;
	private double adultBuffetPrice = 20.99;
	private double totalAdultBuffetPrice;
	private double totalChildBuffetPrice;
	private int countOfChidAboveFive = 0;
	DecimalFormat df = new DecimalFormat("0.00");

	CruiseDetails(String modelOfCruise, double tktCostOfAdult, double tktCostOfChild, int noOfDays) {
		typeOfCruise = modelOfCruise;
		ticketCostOfAdult = tktCostOfAdult;
		ticketCostOfChild = tktCostOfChild;
		numberOfDays = noOfDays;
	}
	

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


	void totalTicketCostForAdults(int noOfAdult) {
		totalticketCostOfAdult = totalticketCostOfAdult + (ticketCostOfAdult * noOfAdult * numberOfDays);
	}

	void totalTicketCostForChild(int ageOfChild) {
		if (ageOfChild > 5) {
			totalTicketCostOfChild = totalTicketCostOfChild + (ticketCostOfChild * numberOfDays);
			countOfChidAboveFive++;
		} else {
			totalTicketCostOfChild = totalTicketCostOfChild + 0;
		}

	}

	void buffetOptionCost(int noOfAdults) {
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
			System.out.println(typeOfCruise + " kids\t\t@  " + countOfChidAboveFive + " : " + totalTicketCostOfChild);
		}
		if (buffetChoice.equalsIgnoreCase("y")) {
			System.out.println("Buffet Special Price Adults \t@  " + noOfAdults + " : " + totalAdultBuffetPrice);
		}
		if ((buffetChoice.equalsIgnoreCase("y")) && (countOfChidAboveFive > 0)) {
			System.out.println("Buffet Special Price Kids\t@  " + countOfChidAboveFive + " : " + totalChildBuffetPrice);
		}
		System.out.println("Total Price \t\t\t: " + df.format(totalAmount));
		System.out.println("HST @ 15% \t\t\t: " + df.format(totalHST));
		System.out.println("Final Price \t\t\t: " + df.format(totalAmount + totalHST));
	}

}
