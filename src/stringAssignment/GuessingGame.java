package stringAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessingGame {
	
	int countNumberOfLinesInFile(File file) throws IOException {
		int numberOfLines=0;
		BufferedReader br = new BufferedReader(new FileReader(file));
		String lineInFile = br.readLine();
		while ((lineInFile != null)) {
			if (!lineInFile.isEmpty()) {
				numberOfLines++;
			}
			lineInFile = br.readLine();
		}
		br.close();
		
		return numberOfLines;
	}

	void guessTheName(String name) {
		int numberOfAttempts = 0;
		boolean isValidLetter = false;
		char[] listOfWrongLettersEntered = new char[5];
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
				listOfWrongLettersEntered[numberOfAttempts]=letterEntered;
				numberOfAttempts++;
				System.out.println(
						"you have guessed " + numberOfAttempts + " wrong letters :" + String.valueOf(listOfWrongLettersEntered));
			} else {
				System.out.println(
						"you have guessed " + numberOfAttempts + " wrong letters :" + String.valueOf(listOfWrongLettersEntered));
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
