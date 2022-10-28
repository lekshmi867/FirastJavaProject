package encapsulation;

import java.util.Scanner;

public class CruiseUser {
	private String emailId;
	private String password;
	private String firstName;
	private String lastName;
	private String phoneNumber;

	Scanner sc = new Scanner(System.in);

	CruiseUser(String emailId, String password, String firstName, String lastName, String phoneNumber) {
		this.emailId = emailId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	private void setEmailId(String email) {
		emailId = email;
	}

	private void setPassword(String pwrd) {
		password = pwrd;
	}

	private void setPhoneNumber(String phneNumber) {
		phoneNumber = phneNumber;
	}

	boolean verifyUserLogin(String email, String pwrd) {
		boolean isLoginSuccessful;
		if ((emailId.equals(email)) && (password.equals(pwrd))) {
			System.out.println("Login Sucessfull");
			isLoginSuccessful = true;
		} else {
			System.out.println("Email-id and password doesn't match");
			isLoginSuccessful = false;
		}
		return isLoginSuccessful;
	}

	boolean verifyPassword() {
		int numberOfAttempts = 3;
		boolean isPasswordMatching;
		do {
			System.out.println("Enter the existing password");
			String pswd = sc.next();
			if (password.equals(pswd)) {
				isPasswordMatching = true;
				break;
			} else {
				System.out.println("Password doesn't match with the existing email-id");
				numberOfAttempts--;
				isPasswordMatching = false;
			}
		} while ((numberOfAttempts > 0) && (!isPasswordMatching));
		if (numberOfAttempts == 0) {
			System.out.println("Reached the maximum number of attempts please try again later ");
		}
		return isPasswordMatching;
	}

	void updateEmailId() {
		String newEmail = null;
		boolean isPasswordMatching = verifyPassword();
		do {
			if (isPasswordMatching) {
				System.out.println("Enter your new email-id");
				newEmail = sc.next();
				if (emailId.equals(newEmail)) {
					System.out.println("Existing e-mail id is same as the new one entered please select another one");
				} else if ((!newEmail.contains("@")) || (!newEmail.contains("."))) {
					System.out.println("Please enter a valid email id with @ and . ");
				} else {
					setEmailId(newEmail);
					System.out.println("Your email id  has been changed!");
					break;
				}
			}
		} while ((emailId.equals(newEmail)) || (!newEmail.contains("@")) || (!newEmail.contains(".")));

	}

	void updatePhoneNumber() {
		String newNumber = null;
		boolean isPasswordMatching = verifyPassword();
		do {
			if (isPasswordMatching) {
				System.out.println("Enter the new phone number");
				newNumber = sc.next();
				if (phoneNumber.equals(newNumber)) {
					System.out
							.println("Existing phone number is same as the new one entered please select another one");
				} else if ((newNumber.length() > 10) || (newNumber.length() < 10)) {
					System.out.println(
							"Please enter a valid password. The length of the password should be in between  5 and 15  ");
				} else {
					setPhoneNumber(newNumber);
					System.out.println("Your phone number has been changed!");
					break;
				}
			}
		} while ((phoneNumber.equals(newNumber)) || newNumber.length() != 10);
	}

	void updatePassword() {
		String newPassword = null;
		boolean isPasswordMatching = verifyPassword();
		do {
			if (isPasswordMatching) {
				System.out.println("Enter your new password");
				newPassword = sc.next();
				if (password.equals(newPassword)) {
					System.out.println("Existing password is same as the new one entered please select another one");
				} else if ((newPassword.length() <= 4) || (newPassword.length() > 15)) {
					System.out.println(
							"Please enter a valid password. The length of the password should be in between  5 and 15  ");
				} else {
					setPassword(newPassword);
					System.out.println("Your password has been changed!");
					break;
				}
			}
		} while ((password.equals(newPassword))||(newPassword.length() <= 4) || (newPassword.length() > 15));
	}
}
