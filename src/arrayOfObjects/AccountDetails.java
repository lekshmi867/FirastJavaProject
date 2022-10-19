package arrayOfObjects;

public class AccountDetails {
	String nameOfAccountHolder;
	String accountNumber;
	int pinNumber;
	double balanceAmount;
	int minimumBalance =100;

	AccountDetails(String name, String accountNo, int pinNo, double balAmount) {
		nameOfAccountHolder = name;
		accountNumber = accountNo;
		pinNumber = pinNo;
		balanceAmount = balAmount;
	}

	void deposit(double depositAmount) {
		balanceAmount = balanceAmount + depositAmount;
		System.out.println("Total balance after deposit is " + balanceAmount);
	}

	void withdraw(double withdrawAmount) {
		if ((balanceAmount > withdrawAmount) && ((balanceAmount - withdrawAmount) > minimumBalance)) {
			balanceAmount = balanceAmount - withdrawAmount;
			System.out.println("Total balance after withdraw is " + balanceAmount);
		} else {
			System.out.println("You don't have sufficient amount to withdraw please select a lower amount");
		}

	}

}
