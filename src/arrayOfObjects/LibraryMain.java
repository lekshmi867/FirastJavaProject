package arrayOfObjects;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookDetails romeoAndJuliet = new BookDetails("Romeo and Juliet", "Shakespere");
		BookDetails peaceOfMind = new BookDetails("Peace of Mind", "Allen");
		BookDetails homeBody = new BookDetails("Home Body", "Rupi Kaur");
		BookDetails twoStates = new BookDetails("Two States", "Chetan Bhagat");
		BookDetails halfGirlfriend = new BookDetails("Half Girlfriend", "Chetan Bhagat");
		BookDetails oliverTwist = new BookDetails("Oliver Twist", "Charles Dickens");
		BookDetails macbeth = new BookDetails("Macbeth", "Shakespere");
		BookDetails harrypotter1 = new BookDetails("Harry Potter and the Sorcere's Stone", "J K Rowling");
		BookDetails malgudyDays = new BookDetails("Malgudy Days", "R K Narayan");
		BookDetails alchemist = new BookDetails("Alchemist", "Paulo Coehlo");

		// Array of Objects
		BookDetails[] bookDetails = { romeoAndJuliet, peaceOfMind, homeBody, twoStates, halfGirlfriend, oliverTwist,
				macbeth, harrypotter1, malgudyDays, alchemist };
		Scanner sc = new Scanner(System.in);
		int bookCount = 0;
		int flagNoMatch = 0;
		do {
			System.out.println("Which book you want to be issued");
			String requiredBookName = sc.nextLine();
			System.out.println("Who is the author");
			String bookAuthor = sc.nextLine();

			// iterating over the array
			for (int i = 0; i < bookDetails.length; i++) {
				if (requiredBookName.equalsIgnoreCase(bookDetails[i].bookName)
						&& bookAuthor.equalsIgnoreCase(bookDetails[i].authorName)) {
					if (!bookDetails[i].isBookIssued) {
						bookDetails[i].isBookIssued = true;
						System.out.println(bookDetails[i].bookName + " is issued");
						bookCount++;
						flagNoMatch = 0;
						break;
					}
				} else {
					flagNoMatch = 1;
				}
				if (requiredBookName.equalsIgnoreCase(bookDetails[i].bookName)
						&& bookAuthor.equalsIgnoreCase(bookDetails[i].authorName) && bookDetails[i].isBookIssued) {
					System.out.println(bookDetails[i].bookName + " is already issued");
					flagNoMatch=0;
					break;
				}

			}
			if (flagNoMatch == 1) {
				System.out.println("No match for that book");
			}
		} while (bookCount < 3);

		if (bookCount == 3) {
			System.out.println("You have already been issued the maximum of three books");
		}

	}
}
