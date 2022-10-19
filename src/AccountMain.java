
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		int flagNoAccountMatch = 0;
		int numberOfPINAttempts = 3;
		int numberOfAccountAttempts = 3;
		int enteredChoice;
		String userChoice;
		int enteredPinNumber = 0;
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

			for (int i = 0; i < accountDetails.length; i++) {
				if ((accountDetails[i].accountNumber.equals(enteredAccountNumber))) {
					flagNoAccountMatch = 0;
					do {
						System.out.println("Enter the pin number ");
						enteredPinNumber = sc.nextInt();
						if ((accountDetails[i].pinNumber == enteredPinNumber)) {
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
							flagNoAccountMatch = 0;
							break;
						} else {
							System.out.println("Account and pin does not match. You have " + (numberOfPINAttempts - 1)
									+ " more attempts left");
							numberOfPINAttempts--;
						}
					} while (numberOfPINAttempts > 0);
					if (numberOfPINAttempts == 0) {
						System.out.println("Your account is locked");
						System.exit(0);
					}
					break;
				} else {
					flagNoAccountMatch = 1;
				}

			}
			if (flagNoAccountMatch == 1) {
				System.out.println("Invalid Account number. Please enter a valid account number");
				numberOfAccountAttempts--;
				if(numberOfAccountAttempts==0) {
					System.out.println("You have reached the maximum number of invalid attempts please try again later");	
				}
			} 
		} while ((flagNoAccountMatch == 1) && (numberOfAccountAttempts > 0));
	}
}
