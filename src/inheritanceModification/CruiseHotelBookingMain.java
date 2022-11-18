package inheritanceModification;

import java.util.Scanner;

public class CruiseHotelBookingMain {

	public static void main(String[] args) {

		String userChoice;
		String wantTobookAgain;
		String typeOfCruiseEntered;
		CruiseDetails selectedCruise = null;
		HotelDetails typeOfSuiteSelected = null;

		Scanner sc = new Scanner(System.in);
		ScenicCruise scenicCruise = new ScenicCruise("Scenic_cruise", 43.99, 12.99, 3);
		SunsetCruise sunsetCruise = new SunsetCruise("Sunset_cruise", 52.99, 15.99, 1);
		DiscoveryCruise discoveryCruise = new DiscoveryCruise("Discovery_cruise", 39.99, 9.99, 4);
		MysteryCruise mysteryCruise = new MysteryCruise("Mystery_cruise", 45.99, 12.99, 2);
		UserDetails cruiseUser = new UserDetails();
		CruiseDetails[] typesOfCruise = { scenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };
		boolean isLoginSuccessful = cruiseUser.registrationAndValidateLogin();
		CruiseDetails cruiseDetails = new CruiseDetails();
		do {
			wantTobookAgain = "";
			userChoice = cruiseUser.choiceOfBooking(isLoginSuccessful);
			if (userChoice.equalsIgnoreCase("cruise")) {
				String userChoiceOfCruise = "";
				do {
					do {
						typeOfCruiseEntered = cruiseDetails.cruiseUserChoice();
						selectedCruise = cruiseDetails.displayCruiseTypes(typesOfCruise, typeOfCruiseEntered);
						System.out.println(
								"Please enter Y if you want to continue with your current selection. Or press any other letter to select again");
						userChoiceOfCruise = sc.next();
					} while (!userChoiceOfCruise.equalsIgnoreCase("y"));

					double costOfAdults = selectedCruise.calculateTotalTicketCostForAdults(
							selectedCruise.getTicketCostOfAdult(), selectedCruise.getNumberOfDays());
					double costOfChildren = selectedCruise.totalTicketCostForChild(
							selectedCruise.getTicketCostOfChild(), selectedCruise.getNumberOfDays());
					double buffetCost = selectedCruise.buffetOptionCost(selectedCruise.getNumberOfDays());
					double costOfOptionalService = 0;
					switch (selectedCruise.getTypeOfCruise()) {
					case "Scenic_cruise":
						costOfOptionalService = scenicCruise.calculateCostofSpa();
						break;
					case "Sunset_cruise":
						costOfOptionalService = sunsetCruise.calculateCostOfCandleLightDinner();
						break;
					case "Discovery_cruise":
						costOfOptionalService = discoveryCruise.calculateCostOfAdventureGame();
						break;
					case "Mystery_cruise":
						costOfOptionalService = mysteryCruise.calculateCostOfCasino();
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
					double calculateHST = selectedCruise.calculateHST(costOfAdults, costOfChildren, buffetCost,
							costOfOptionalService);
					double totalPrice = selectedCruise.calculateTotalCost(costOfAdults, costOfChildren, buffetCost,
							costOfOptionalService, calculateHST);
					selectedCruise.totalCost(costOfAdults, costOfChildren, buffetCost, costOfOptionalService,
							calculateHST, totalPrice, selectedCruise.getTypeOfCruise());

				} while (!(userChoiceOfCruise.equalsIgnoreCase("Y")));
			} else if (userChoice.equalsIgnoreCase("hotel")) {
				DeluxSuite deluxSuite = new DeluxSuite("Delux_suite", 2, 2, 180);
				FamilySuite familySuite = new FamilySuite("Family_suite", 4, 4, 230);
				HotelDetails[] typesOfHotel = { deluxSuite, familySuite };

				HotelDetails hotelDetails = new HotelDetails();
				
				String typeOfSuiteEntered = hotelDetails.hotelUserChoice();
				typeOfSuiteSelected = hotelDetails.getHotelRoomSelected(typesOfHotel, typeOfSuiteEntered);

				typeOfSuiteSelected.getNoOfAdults(typeOfSuiteSelected.getMaximumNoOfAdultsAllowed());
				typeOfSuiteSelected.getNoOfChildrenAbove5(typeOfSuiteSelected.getMaximumNoOfChildAllowed());
				typeOfSuiteSelected.getNumberOfDaysRequired();
				double roomCost = typeOfSuiteSelected.calculateRoomCost(typeOfSuiteSelected.getRoomCost());
				double mealCost = typeOfSuiteSelected.mealOptionCost();
				double calculateHST = typeOfSuiteSelected.calculateHST(roomCost, mealCost);
				double calculateTotalCost = typeOfSuiteSelected.calculateTotalCost(roomCost, mealCost, calculateHST);
				typeOfSuiteSelected.totalCost(roomCost, mealCost, calculateHST, calculateTotalCost,
						typeOfSuiteSelected.getTypeOfRoom());

			} else {
				System.out.println("Invalid room choice please start once again");
			}
			System.out.println("Do you want to book another Hotel Room or Cruise. Press y to continue");
			wantTobookAgain = sc.next();
		} while (wantTobookAgain.equalsIgnoreCase("y"));

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
