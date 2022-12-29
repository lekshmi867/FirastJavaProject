package inheritanceAssignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
	private String emailId;
	private String password;
	private String firstName;
	private String phoneNumber;

	Scanner sc = new Scanner(System.in);

	void userRegistration() {
		boolean isEmailValid;
		boolean isPasswordValid;
		boolean isFirstNameValid;
		boolean isPhoneNumberValid;
		System.out.println("Welcome to Cruise Booking");
		do {
			System.out.println("Enter the e-mail id. EmailId should contain @ and . symbol");
			emailId = sc.next();
			isEmailValid = validateEmail(emailId);
		} while (!isEmailValid);
		do {
			System.out.println("Enter the password.Password should be of length 8-20 and it should contains atleast one capital letter, one small letter, one digit and one special character");
			password = sc.next();
			isPasswordValid = validatePassword(password);
		} while (!isPasswordValid);
		do {
			System.out.println("Enter your first name");
			firstName = sc.next();
			isFirstNameValid = validateFirstName(firstName);
		} while (!isFirstNameValid);
		do {
			System.out.println("Enter your phone number");
			phoneNumber = sc.next();
			isPhoneNumberValid = validatePhoneNumber(phoneNumber);
		} while (!isPhoneNumberValid);
		System.out.println("Thank you for registering!");

	}

	private boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile("^(.+)@(.+)$");
		Matcher matcher = pattern.matcher(email);  
		return matcher.matches();
	}

	private boolean validatePassword(String pswd) {
		Pattern pattern = Pattern.compile("^(?=.*[0-9])\" + \"(?=.*[a-z])(?=.*[A-Z])\" + \"(?=.*[@#$%^&+=])\" + \"(?=\\\\S+$).{8,20}$");
		Matcher matcher = pattern.matcher(pswd);  
		return matcher.matches();
	}

	private boolean validateFirstName(String frstName) {
		Pattern pattern = Pattern.compile("^[a-zA-Z]*$");
		Matcher matcher = pattern.matcher(frstName);  
		return matcher.matches();
	}

	private boolean validatePhoneNumber(String phneNumber) {
		boolean isPhoneNumberValid;
		if ((phneNumber.length() != 10) || (!phneNumber.matches("^[0-9]*$"))) {
			System.out.println("Please enter a valid phone number. Phone number should be a 10 digit number");
			isPhoneNumberValid = false;
		} else {
			isPhoneNumberValid = true;
		}
		return isPhoneNumberValid;
	}

	private boolean verifyUserLogin() {
		boolean isLoginSuccessful;
		int numberOfAttempts = 3;
		System.out.println("Please Login to the system");
		do {
			System.out.println("Enter the email-id");
			String email = sc.next();
			System.out.println("Enter the password ");
			String pwrd = sc.next();
			if ((emailId.equals(email)) && (password.equals(pwrd))) {
				System.out.println("Login Sucessfull");
				isLoginSuccessful = true;
			} else {
				System.out.println("Email-id and password doesn't match");
				isLoginSuccessful = false;
				numberOfAttempts--;
			}
		} while ((numberOfAttempts > 0) && (!isLoginSuccessful));
		if (numberOfAttempts == 0) {
			System.out.println("You have reached the maximum number of attempts. Please start again");
			System.exit(0);
		}
		return isLoginSuccessful;
	}

	private boolean verificationWithExistingPassword() {
		int numberOfAttempts = 3;
		boolean isPasswordMatching;
		do {
			System.out.println("Enter the existing password");
			String pswd = sc.next();
			if (password.equals(pswd)) {
				System.out.println("Password verifed!!!");
				isPasswordMatching = true;
				break;
			} else {
				System.out.println("Password doesn't match with the existing password");
				numberOfAttempts--;
				isPasswordMatching = false;
			}
		} while ((numberOfAttempts > 0) && (!isPasswordMatching));
		if (numberOfAttempts == 0) {
			System.out.println("Reached the maximum number of attempts please try again later ");
		}
		return isPasswordMatching;
	}

	void setEmailId() {
		String newEmail = null;
		boolean isPasswordMatching = verificationWithExistingPassword();
		if (isPasswordMatching) {
			boolean isEmailValid;
			do {
				System.out.println("Enter your new email-id");
				newEmail = sc.next();
				if (emailId.equals(newEmail)) {
					System.out.println("Existing e-mail id is same as the new one entered please select another one");
				}
				isEmailValid = validateEmail(newEmail);
			} while ((!isEmailValid) || (emailId.equals(newEmail)));
			if (isEmailValid) {
				emailId = newEmail;
				System.out.println("Your email id has been changed successfully");
			}
		}

	}

	void setPhoneNumber() {
		String newPhoneNumber = null;
		boolean isPasswordMatching = verificationWithExistingPassword();
		if (isPasswordMatching) {
			boolean isPhoneNumberValid;
			do {
				System.out.println("Enter your new phone number");
				newPhoneNumber = sc.next();
				if (phoneNumber.equals(newPhoneNumber)) {
					System.out
							.println("Existing phone number is same as the new one entered please select another one");
				}
				isPhoneNumberValid = validatePhoneNumber(newPhoneNumber);
			} while ((!isPhoneNumberValid) || (phoneNumber.equals(newPhoneNumber)));
			if (isPhoneNumberValid) {
				phoneNumber = newPhoneNumber;
				System.out.println("Your phone number has been changed successfully");
			}
		}
	}

	void setPassword() {
		String newPassword = null;
		boolean isPasswordMatching = verificationWithExistingPassword();
		if (isPasswordMatching) {
			boolean isPasswordValid;
			do {
				System.out.println("Enter your new password");
				newPassword = sc.next();
				if (password.equals(newPassword)) {
					System.out.println("Existing password is same as the new one entered please select another one");
				}
				isPasswordValid = validatePassword(newPassword);
			} while ((!isPasswordValid) || (password.equals(newPassword)));
			if (isPasswordValid) {
				password = newPassword;
				System.out.println("Your password has been changed successfully");
			}
		}
	}

	public boolean registrationAndValidateLogin() {
		userRegistration();

		boolean isLoginSuccessfull = verifyUserLogin();
		if (isLoginSuccessfull) {
			return true;
		}
		return false;
	}

	public String choiceOfBooking(boolean isLoginSuccessfull) {
		String userChoice = null;
		if (isLoginSuccessfull) {
			String userInput = "";
			do {
				userInput = "";
				System.out.println("Please enter the service you want to book Criuse/Hotel ");
				userChoice = sc.next();
				if ((!(userChoice.equalsIgnoreCase("cruise"))) && (!(userChoice.equalsIgnoreCase("hotel")))) {
					System.out.println("Invalid service. Please enter Y to continue ");
					userInput = sc.next();
				}
			} while (userInput.equalsIgnoreCase("y"));
		}
		return userChoice;
	}

}
