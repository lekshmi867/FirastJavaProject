package inheritanceAssignment;

import java.util.Scanner;

public class CruiseHotelBookingMain {

	public static void main(String[] args) {

		String userChoice;
		String wantTobookAgain;
		String userInvalidCruiseChoice = "";
		String userInvalidHotelChoice = "";
		int typeOfCruiseEntered;

		Scanner sc = new Scanner(System.in);
		UserDetails cruiseUser = new UserDetails();
		boolean isLoginSuccessful = cruiseUser.registrationAndValidateLogin();
		do {
			wantTobookAgain ="";
			userChoice = cruiseUser.choiceOfBooking(isLoginSuccessful);
			if (userChoice.equalsIgnoreCase("cruise")) {
				ScenicCruise scenicCruise = new ScenicCruise("Scenic_cruise", 43.99, 12.99, 3);
				SunsetCruise sunsetCruise = new SunsetCruise("Sunset_cruise", 52.99, 15.99, 1);
				DiscoveryCruise discoveryCruise = new DiscoveryCruise("Discovery_cruise", 39.99, 9.99, 4);
				MysteryCruise mysteryCruise = new MysteryCruise("Mystery_cruise", 45.99, 12.99, 2);
				String userChoiceOfCruise = "";
				CruiseDetails cruiseDetails = new CruiseDetails();
				do {
					do {
						userInvalidCruiseChoice = "";
						typeOfCruiseEntered = cruiseDetails.cruiseUserChoice();
						Object typeOfObject = typeOfCruiseEntered;
						switch (typeOfCruiseEntered) {
						case 1:
							System.out.println("The cruise that you have selected is " + scenicCruise.getTypeOfCruise()
									+ " which is a " + scenicCruise.getNumberOfDays() + " day cruise");
							System.out.println("Price for Adults(greater than 12) per day    : "
									+ scenicCruise.getTicketCostOfAdult());
							System.out.println("Price for kids above 5 per day               : "
									+ scenicCruise.getTicketCostOfChild());
							break;
						case 2:
							System.out.println("The cruise that you have selected is " + sunsetCruise.getTypeOfCruise()
									+ " which is a " + sunsetCruise.getNumberOfDays() + " day cruise");
							System.out.println("Price for Adults(greater than 12) per day    : "
									+ sunsetCruise.getTicketCostOfAdult());
							System.out.println("Price for kids above 5 per day               : "
									+ sunsetCruise.getTicketCostOfChild());
							break;
						case 3:
							System.out
									.println("The cruise that you have selected is " + discoveryCruise.getTypeOfCruise()
											+ " which is a " + discoveryCruise.getNumberOfDays() + " day cruise");
							System.out.println("Price for Adults(greater than 12) per day    : "
									+ discoveryCruise.getTicketCostOfAdult());
							System.out.println("Price for kids above 5 per day               : "
									+ discoveryCruise.getTicketCostOfChild());
							break;
						case 4:
							System.out.println("The cruise that you have selected is " + mysteryCruise.getTypeOfCruise()
									+ " which is a " + mysteryCruise.getNumberOfDays() + " day cruise");
							System.out.println("Price for Adults(greater than 12) per day    : "
									+ mysteryCruise.getTicketCostOfAdult());
							System.out.println("Price for kids above 5 per day               : "
									+ mysteryCruise.getTicketCostOfChild());
							break;
						default:
							System.out.println(
									"Invalid option. Please select a cruise option from 1-4. Do you want to select another option press y to continue?");
							userInvalidCruiseChoice = sc.next();
							if (!(userInvalidCruiseChoice.equalsIgnoreCase("y"))) {
								System.exit(0);
							}
							break;
						}
					} while (userInvalidCruiseChoice.equalsIgnoreCase("y"));
					

					System.out.println(
							"Please enter Y if you want to continue with your current selection. Or press any other letter to select again");
					userChoiceOfCruise = sc.next();
					if (userChoiceOfCruise.equalsIgnoreCase("y")) {
						switch (typeOfCruiseEntered) {
						case 1: {
							double costOfAdults = scenicCruise.calculateTotalTicketCostForAdults(
									scenicCruise.getTicketCostOfAdult(), scenicCruise.getNumberOfDays());
							double costOfChildren = scenicCruise.totalTicketCostForChild(
									scenicCruise.getTicketCostOfChild(), scenicCruise.getNumberOfDays());
							double buffetCost = scenicCruise.buffetOptionCost(scenicCruise.getNumberOfDays());
							double costOfSpa = scenicCruise.calculateCostofSpa();
							double calculateHST = scenicCruise.calculateHST(costOfAdults, costOfChildren, buffetCost,
									costOfSpa);
							double totalPrice = scenicCruise.calculateTotalCost(costOfAdults, costOfChildren,
									buffetCost, costOfSpa, calculateHST);
							scenicCruise.totalCost(costOfAdults, costOfChildren, buffetCost, costOfSpa,
									scenicCruise.getAdultsForSpa(), calculateHST, totalPrice,
									scenicCruise.getTypeOfCruise());
							break;
						}
						case 2: {
							double costOfAdults = sunsetCruise.calculateTotalTicketCostForAdults(
									sunsetCruise.getTicketCostOfAdult(), sunsetCruise.getNumberOfDays());
							double costOfChildren = sunsetCruise.totalTicketCostForChild(
									sunsetCruise.getTicketCostOfChild(), sunsetCruise.getNumberOfDays());
							double buffetCost = sunsetCruise.buffetOptionCost(sunsetCruise.getNumberOfDays());
							double costOfCandleLight = sunsetCruise.calculateCostOfCandleLightDinner();
							double calculateHST = sunsetCruise.calculateHST(costOfAdults, costOfChildren, buffetCost,
									costOfCandleLight);
							double totalPrice = sunsetCruise.calculateTotalCost(costOfAdults, costOfChildren,
									buffetCost, costOfCandleLight, calculateHST);
							sunsetCruise.totalCost(costOfAdults, costOfChildren, buffetCost, costOfCandleLight,
									sunsetCruise.getPersonForCandleLightDinner(), calculateHST, totalPrice,
									sunsetCruise.getTypeOfCruise());
							break;
						}
						case 3: {
							double costOfAdults = discoveryCruise.calculateTotalTicketCostForAdults(
									discoveryCruise.getTicketCostOfAdult(), discoveryCruise.getNumberOfDays());
							double costOfChildren = discoveryCruise.totalTicketCostForChild(
									discoveryCruise.getTicketCostOfChild(), discoveryCruise.getNumberOfDays());
							double buffetCost = discoveryCruise.buffetOptionCost(discoveryCruise.getNumberOfDays());
							double costOfSpa = discoveryCruise.calculateCostOfAdventureGame();
							double calculateHST = discoveryCruise.calculateHST(costOfAdults, costOfChildren, buffetCost,
									costOfSpa);
							double totalPrice = discoveryCruise.calculateTotalCost(costOfAdults, costOfChildren,
									buffetCost, costOfSpa, calculateHST);
							discoveryCruise.totalCost(costOfAdults, costOfChildren, buffetCost, costOfSpa,
									discoveryCruise.getPersonForAdventureGame(), calculateHST, totalPrice,
									discoveryCruise.getTypeOfCruise());
							break;
						}
						case 4: {
							double costOfAdults = mysteryCruise.calculateTotalTicketCostForAdults(
									mysteryCruise.getTicketCostOfAdult(), mysteryCruise.getNumberOfDays());
							double costOfChildren = mysteryCruise.totalTicketCostForChild(
									mysteryCruise.getTicketCostOfChild(), mysteryCruise.getNumberOfDays());
							double buffetCost = mysteryCruise.buffetOptionCost(mysteryCruise.getNumberOfDays());
							double costOfSpa = mysteryCruise.calculateCostOfCasino();
							double calculateHST = mysteryCruise.calculateHST(costOfAdults, costOfChildren, buffetCost,
									costOfSpa);
							double totalPrice = mysteryCruise.calculateTotalCost(costOfAdults, costOfChildren,
									buffetCost, costOfSpa, calculateHST);
							mysteryCruise.totalCost(costOfAdults, costOfChildren, buffetCost, costOfSpa,
									mysteryCruise.getPersonForCasino(), calculateHST, totalPrice,
									mysteryCruise.getTypeOfCruise());
							break;
						}

						default:
							System.out.println("Invalid choice please select another option");
							break;
						}
					}

				} while (!(userChoiceOfCruise.equalsIgnoreCase("Y")));
			} else if (userChoice.equalsIgnoreCase("hotel")) {
				DeluxSuite deluxSuite = new DeluxSuite("Delux_suite", 2, 2, 180);
				FamilySuite familySuite = new FamilySuite("Family_room", 4, 4, 230);

				HotelDetails hotelDetails = new HotelDetails();
				do {
					int typeOfSuiteEntered = hotelDetails.hotelUserChoice();
					switch (typeOfSuiteEntered) {
					case 1: {
						deluxSuite.getNoOfAdults(deluxSuite.getMaximumNoOfAdultsAllowed());
						deluxSuite.getNoOfChildrenAbove5(deluxSuite.getMaximumNoOfChildAllowed());
						deluxSuite.getNumberOfDaysRequired();
						double roomCost = deluxSuite.calculateRoomCost(deluxSuite.getRoomCost());
						double mealCost = deluxSuite.mealOptionCost();
						double calculateHST = deluxSuite.calculateHST(roomCost, mealCost);
						double calculateTotalCost = deluxSuite.calculateTotalCost(roomCost, mealCost, calculateHST);
						deluxSuite.totalCost(roomCost, mealCost, calculateHST, calculateTotalCost,
								deluxSuite.getTypeOfRoom());
						break;
					}
					case 2: {
						familySuite.getNoOfAdults(familySuite.getMaximumNoOfAdultsAllowed());
						familySuite.getNoOfChildrenAbove5(familySuite.getMaximumNoOfChildAllowed());
						familySuite.getNumberOfDaysRequired();
						double roomCost = familySuite.calculateRoomCost(familySuite.getRoomCost());
						double mealCost = familySuite.mealOptionCost();
						double calculateHST = familySuite.calculateHST(roomCost, mealCost);
						double calculateTotalCost = familySuite.calculateTotalCost(roomCost, mealCost, calculateHST);
						familySuite.totalCost(roomCost, mealCost, calculateHST, calculateTotalCost,
								familySuite.getTypeOfRoom());
						break;
					}

					default:
						System.out
								.println("Invalid choice please select a valid option. Press Y select another option.");
						userInvalidHotelChoice = sc.next();
						break;
					}

				} while (userInvalidHotelChoice.equalsIgnoreCase("Y"));

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
