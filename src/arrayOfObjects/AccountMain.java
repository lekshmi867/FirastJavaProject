package arrayOfObjects;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		int flagNoMatch = 0;
		int numberOfAttempts = 3;
		int enteredChoice;
		String userChoice;
		AccountDetails userOne = new AccountDetails("Netra", "45671234", 2345, 1785.0);
		AccountDetails userTwo = new AccountDetails("Isha", "49678254", 1234, 2895.0);
		AccountDetails userThree = new AccountDetails("Jeeva", "45983451", 6789, 1946.0);
		AccountDetails userFour = new AccountDetails("Meenu", "48961236", 7123, 3488.0);
		AccountDetails userFive = new AccountDetails("Nayana", "47801654", 8132, 5645.0);

		AccountDetails[] accountDetails = { userOne, userTwo, userThree, userFour, userFive };

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the account number");
			String enteredAccountNumber = sc.next();
			System.out.println("Enter the pin number ");
			int enteredPinNumber = sc.nextInt();

			for (int i = 0; i < accountDetails.length; i++) {
				if ((accountDetails[i].accountNumber.equals(enteredAccountNumber))
						&& (accountDetails[i].pinNumber == enteredPinNumber)) {
					System.out.println("Login successfull!!!");
					System.out.println("Hello " + accountDetails[i].nameOfAccountHolder + " !!!");
					System.out.println("Your balance is : " + accountDetails[i].balanceAmount);
					do {
						do {
							System.out.println(
									"Do you want to deposit or withdraw money?\n 1. Deposit \n 2. Withdraw\n Enter your choice");
							enteredChoice = sc.nextInt();
						} while (enteredChoice > 2);
						if (enteredChoice == 1) {
							System.out.println("Enter the amount you want to deposit");
							double depositAmount = sc.nextDouble();
							accountDetails[i].deposit(depositAmount);
						} else {
							System.out.println("Enter the amount you want to withdraw");
							double withdrawAmount = sc.nextDouble();
							accountDetails[i].withdraw(withdrawAmount);
						}
						System.out.println("Do you want to continue? Press Y to continue");
						userChoice = sc.next();
					} while (userChoice.equalsIgnoreCase("y"));
					flagNoMatch = 0;
					break;
				} else {
					flagNoMatch = 1;
				}

			}
			if (flagNoMatch == 1) {
				System.out.println("Account and pin does not match. You have " + (numberOfAttempts - 1) + " more attempts left");
				numberOfAttempts--;
			} else {
				System.out.println("You have reached the maximum number of invalid attempts. Your account is locked");
				break;
			}
		} while (numberOfAttempts > 0);

	}

}
