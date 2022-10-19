package constructorAssignment;

import java.util.Scanner;

public class CruiseMain {

	public static void main(String[] args) {
		int notInList = 0;
		String wantToContinue = "y";
		String userChoice;
		String typeOfCruiseEntered;
		String buffetChoice;
		int numberOfAdults;

		CruiseDetails scenicCruise = new CruiseDetails("Scenic Cruise", 43.99, 12.99, 3);
		CruiseDetails sunsetCruise = new CruiseDetails("Sunset Cruise", 52.99, 15.99, 1);
		CruiseDetails discoveyCruise = new CruiseDetails("Discovery Cruise", 39.99, 9.99, 4);
		CruiseDetails mysteryCruise = new CruiseDetails("Mystery Cruise", 45.99, 12.99, 2);

		CruiseDetails[] cruiseDetails = { scenicCruise, sunsetCruise, discoveyCruise, mysteryCruise };
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"We offer 4 different packages as displayed below. Please enter the cruise that you want to select");
			for (int i = 0; i < cruiseDetails.length; i++) {
				System.out.println(cruiseDetails[i].typeOfCruise);
			}
			typeOfCruiseEntered = sc.nextLine();
			for (int i = 0; i < cruiseDetails.length; i++) {
				if (cruiseDetails[i].typeOfCruise.equalsIgnoreCase(typeOfCruiseEntered)) {
					notInList = 0;
					System.out.println("The cruise that you have selected is " + cruiseDetails[i].typeOfCruise
							+ " which is a " + cruiseDetails[i].numberOfDays + " day cruise");
					System.out.println(
							"Price for Adults(greater than 12) per day    : " + cruiseDetails[i].ticketCostOfAdult);
					System.out.println(
							"Price for kids above 5 per day               : " + cruiseDetails[i].ticketCostOfChild);
					break;
				} else {
					notInList = 1;
				}

			}
			if (notInList == 1) {
				System.out.println("This type of cruise is not available please select another option from the list. Press Y to select another option");
				userChoice = sc.nextLine();
				if(!userChoice.equalsIgnoreCase("y")) {
					System.exit(0);
				}
			}else {
				System.out.println(
						"Please press Y if you want to continue with the selection or press any other alphabet to select another");
				userChoice = sc.nextLine();
			}
		} while ((notInList > 0) || (!wantToContinue.equalsIgnoreCase(userChoice)));
		for (int i = 0; i < cruiseDetails.length; i++) {
			if (cruiseDetails[i].typeOfCruise.equalsIgnoreCase(typeOfCruiseEntered)) {
				do {
					System.out.println("Enter the number of adults");
					numberOfAdults = sc.nextInt();
				} while (numberOfAdults==0);
				cruiseDetails[i].totalCostForAdults(numberOfAdults);
				System.out.println("Enter the number of children");
				int numberOfChildren = sc.nextInt();
				for (int j = 1; j <= numberOfChildren; j++) {
					System.out.println("Enter the age of child " + j);
					int ageOfChild = sc.nextInt();
					cruiseDetails[i].totalCostForChild(ageOfChild);
				}
				System.out.println(
						"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids? Press Y to select and N to go to the final price");
				buffetChoice = sc.next();
				if (buffetChoice.equalsIgnoreCase("y")) {
					cruiseDetails[i].buffetOption(numberOfAdults);
				} else if (buffetChoice.equalsIgnoreCase("n")) {
					System.out.println("You have not selected the buffet option");
				} else {
					System.out.println("Invalid Option selected");
				}
				cruiseDetails[i].totalCost(numberOfAdults, numberOfChildren, buffetChoice);
			}
		}
	}

}
