package assignmentWeek9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessingGameMethod {

	void guessTheName(String name) {
		int numberOfAttempts = 0;
		boolean isValidLetter = false;
		List<Character> listOfLettersEntered = new ArrayList<Character>();
		System.out.println("****************************************************************");
		System.out.println("Welcome to name guessing challenge");
		System.out.println("****************************************************************");
		System.out.println("Guess the name given below");
		String maskedName = name.replaceAll("\\w", "_");
		System.out.println(maskedName);
		char[] charArrayMaskedName = maskedName.toCharArray();
		do {
			System.out.println("Guess a letter");
			Scanner sc = new Scanner(System.in);
			char letterEntered = sc.next().charAt(0);
			letterEntered = Character.toLowerCase(letterEntered);
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == letterEntered) {
					charArrayMaskedName[i] = letterEntered;
					isValidLetter = true;
				}
			}
			
			if (name.equals(String.valueOf(charArrayMaskedName))) {
				System.out.println("****************************************************************");
				System.out.println("Congratulation you win!!!!!!");
				System.out.println("You have correctly guessed the name " + "\""
						+ String.valueOf(charArrayMaskedName) + "\"");
				System.out.println("****************************************************************");
				break;
			}
			else {
				System.out.println( String.valueOf(charArrayMaskedName));
			}

			if (!isValidLetter) {
				++numberOfAttempts;
				listOfLettersEntered.add(letterEntered);
				System.out.println(
						"you have guessed " + numberOfAttempts + " wrong letters :" + listOfLettersEntered.toString());
			} else {
				System.out.println(
						"you have guessed " + numberOfAttempts + " wrong letters :" + listOfLettersEntered.toString());
				isValidLetter = false;
			}
			

		} while ((numberOfAttempts < 5) && (!isValidLetter));

		if (numberOfAttempts == 5) {
			System.out.println("****************************************************************");
			System.out.println("Sorry You Lost the Game!!!! Better Luck Next Time");
			System.out.println("****************************************************************");
		}
	}

}
