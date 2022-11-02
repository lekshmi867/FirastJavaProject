package assignmentWeek9;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessingGameMain {

	public static void main(String[] args) throws IOException {
		String userChoice;
		List<String> listOfNames = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\NameList.txt"));
		String lineInFile = br.readLine();
		while (lineInFile != null) {
			if (!lineInFile.isEmpty()) {
				listOfNames.add(lineInFile);
			}
			lineInFile = br.readLine();
		}
		br.close();
		String[] arrayOfNames = listOfNames.toArray(new String[0]);
		GuessingGameMethod game = new GuessingGameMethod();
		do {
			Random r = new Random();
			int randomInteger = r.nextInt(arrayOfNames.length);
			String randomName = arrayOfNames[randomInteger].toLowerCase();
			game.guessTheName(randomName);
			Scanner sc = new Scanner(System.in);
			System.out.println("Do you want to play again??. Press y to continue");
			userChoice = sc.next();
		} while (userChoice.equals("y"));
	}

}
