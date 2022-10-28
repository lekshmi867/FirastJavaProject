package encapsulationAssignment;

import java.util.Scanner;

public class CruiseMain {

	public static void main(String[] args) {
		int notInList = 0;
		String wantToContinue = "y";
		String userChoice;
		String typeOfCruiseEntered;
		String buffetChoice;
		int numberOfAdults;
		int ageOfChild;
		boolean isLoginSuccessfull;

		Scanner sc = new Scanner(System.in);

		// Created instance for each type of cruise
		CruiseDetails scenicCruise = new CruiseDetails("Scenic_cruise", 43.99, 12.99, 3);
		CruiseDetails sunsetCruise = new CruiseDetails("Sunset_cruise", 52.99, 15.99, 1);
		CruiseDetails discoveyCruise = new CruiseDetails("Discovery_cruise", 39.99, 9.99, 4);
		CruiseDetails mysteryCruise = new CruiseDetails("Mystery_cruise", 45.99, 12.99, 2);

		// Created an array of objects
		CruiseDetails[] cruiseDetails = { scenicCruise, sunsetCruise, discoveyCruise, mysteryCruise };

		// CruiseDetailsUser object creation
		CruiseUser cruiseUser = new CruiseUser();
		
		//prompt user to enter the user details
		System.out.println("Welcome to Cruise Booking");
		cruiseUser.userRegistration();
		System.out.println("Thank you for registering!");

		// verify user login
		isLoginSuccessfull = cruiseUser.verifyUserLogin();

		if (isLoginSuccessfull) {
			do {
				System.out.println(
						"We offer 4 different packages as displayed below. Please enter the cruise that you want to select");
				for (int i = 0; i < cruiseDetails.length; i++) {
					System.out.println(cruiseDetails[i].getTypeOfCruise());
				}
				typeOfCruiseEntered = sc.next();
				for (int i = 0; i < cruiseDetails.length; i++) {
					if (cruiseDetails[i].getTypeOfCruise().equalsIgnoreCase(typeOfCruiseEntered)) {
						notInList = 0;
						System.out.println("The cruise that you have selected is " + cruiseDetails[i].getTypeOfCruise()
								+ " which is a " + cruiseDetails[i].getNumberOfDays() + " day cruise");
						System.out.println("Price for Adults(greater than 12) per day    : "
								+ cruiseDetails[i].getTicketCostOfAdult());
						System.out.println("Price for kids above 5 per day               : "
								+ cruiseDetails[i].getTicketCostOfChild());
						break;
					} else {
						notInList = 1;
					}

				}
				if (notInList == 1) {
					System.out.println(
							"This type of cruise is not available please select another option from the list.Press Y to select another option or press any other key to exit");
					userChoice = sc.next();
					if (!userChoice.equalsIgnoreCase("y")) {
						System.exit(0);
					}
				} else {
					System.out.println(
							"Please press Y if you want to continue with the selection or press any other alphabet to select another");
					userChoice = sc.next();
				} // want to continue with other option other than y
			} while ((notInList > 0) || (!wantToContinue.equalsIgnoreCase(userChoice)));
			for (int i = 0; i < cruiseDetails.length; i++) {
				if (cruiseDetails[i].getTypeOfCruise().equalsIgnoreCase(typeOfCruiseEntered)) {
					do {
						System.out.println("Enter the number of adults");
						numberOfAdults = sc.nextInt();
					} while (numberOfAdults == 0);
					cruiseDetails[i].totalTicketCostForAdults(numberOfAdults);
					System.out.println("Enter the number of children");
					int numberOfChildren = sc.nextInt();
					for (int j = 1; j <= numberOfChildren; j++) {
						do {
							System.out.println("Enter the age of child " + j);
							ageOfChild = sc.nextInt();
							if (ageOfChild > 12) {
								System.out.println("Please enter child age below 12");
							}
						} while (ageOfChild > 12);

						cruiseDetails[i].totalTicketCostForChild(ageOfChild);
					}
					System.out.println(
							"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?"
									+ " Press Y to select and N to go to the final price");
					buffetChoice = sc.next();
					if (buffetChoice.equalsIgnoreCase("y")) {
						cruiseDetails[i].buffetOptionCost(numberOfAdults);
					} else if (buffetChoice.equalsIgnoreCase("n")) {
						System.out.println("You have not selected the buffet option");
					} else {
						System.out.println("Invalid Option selected");
					}
					cruiseDetails[i].totalCost(numberOfAdults, numberOfChildren, buffetChoice);
				}
			}
			do {
				System.out.println(
						"Do you want to change your personal information. Press Y to change. Press any other alphabet to exit.");
				userChoice = sc.next();
				if (userChoice.equalsIgnoreCase("Y")) {
					System.out.println("Please enter the information you want to change.\n" + "1. Password\n"
							+ "2. Phone number\n" + "3. Email\n" + "Enter your choice from 1-3");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						cruiseUser.setPassword();
						break;
					case 2:
						cruiseUser.setPhoneNumber();
						break;
					case 3:
						cruiseUser.setEmailId();
						break;
					default:
						System.out.println("Invalid choice please select other option");
						break;
					}
				}
			} while (userChoice.equalsIgnoreCase("Y"));
			if (!userChoice.equalsIgnoreCase("Y")) {
				System.out.println("Thank you for using the service!");
			}

		}
	}

}
