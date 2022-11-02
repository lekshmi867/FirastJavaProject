
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessingGameMain {

	public static void main(String[] args) throws IOException {
		String userChoice;
		int numberOfLines = 0;
		int arrayCount=0;

		GuessingGameMethod game = new GuessingGameMethod();
		numberOfLines = game.countNumberOfLinesInFile();
		File file = new File("C:\\Users\\user\\Desktop\\NameList.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String lineInFile = br.readLine();
		String[] arrayOfNames = new String[numberOfLines];
		while (lineInFile != null) {
			if (!lineInFile.isEmpty()) {
				arrayOfNames[arrayCount] = lineInFile;
				arrayCount++;
			}
			lineInFile = br.readLine();
		}
		br.close();
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
