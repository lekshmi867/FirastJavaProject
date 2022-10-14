/*Program to calculate crs score*/
package methodAssignment;

import java.util.Scanner;

public class CRSMainMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int finalPoints = 0;

		// Instantiate Class
		CRSPointCalculator cp = new CRSPointCalculator();
		int invalidEducationLevelAttempts =0;
		int choice =0;
		do {
		System.out.println("Enter your Education Level: \n" + " 1. Phd \n" + " 2. Masters \n"
				+ " 3.Two or more university degrees/diplomas at the bachelor’s level one of which is a three year or longer duration \n "
				+ "4.12th+ Three Years or longer Degree /Diploma \n " + "Enter your option from 1 - 4 \n");
		choice = sc.nextInt();
		if(choice<=4) {
			finalPoints = finalPoints + cp.pointsForEducationalQualification(choice);
			break;
		}else {
			System.out.println("Invalid Education level");
			invalidEducationLevelAttempts++;
		}
		}while(invalidEducationLevelAttempts<=2);
		if(invalidEducationLevelAttempts==3) {
			System.out.println("Reached maximum attempts please start from the beginning");
			System.exit(0);
		}
		
		System.out.println("Enter your Experience in years: ");
		int totalExp = sc.nextInt();

		// invoking experience method
		finalPoints = finalPoints + cp.pointsForExperience(totalExp);

		System.out.println("Enter your age in years: ");
		int yearsofAge = sc.nextInt();

		// invoking age method
		finalPoints = finalPoints + cp.pointsForAge(yearsofAge);

		System.out.println("Enter your IELTS Score for Listening: ");
		double listeningScore = sc.nextDouble();

		// invoking ieltsListeningScore method
		finalPoints = finalPoints + cp.pointsForIeltsListeningScore(listeningScore);

		System.out.println("Enter your IELTS Score for Writing: ");
		double WritingScore = sc.nextDouble();

		// invoking ieltsReadWriteSpeakScore method
		finalPoints = finalPoints + cp.pointsForIeltsReadWriteSpeakScore(WritingScore);

		System.out.println("Enter your IELTS Score for reading : ");
		double readingScore = sc.nextDouble();

		// invoking ieltsReadWriteSpeakScore method
		finalPoints = finalPoints + cp.pointsForIeltsReadWriteSpeakScore(readingScore);

		System.out.println("Enter your IELTS Score for speaking : ");
		double speakingScore = sc.nextDouble();

		// invoking ieltsReadWriteSpeakScore method
		finalPoints = finalPoints + cp.pointsForIeltsReadWriteSpeakScore(speakingScore);

		System.out.println(
				"If you have a relative  in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian Citizen or PR holder (Y/N) ");
		String relativeInCanada = sc.next();

		// invoking relativeOrStudyInCanada method
		finalPoints = finalPoints + cp.pointsForAdaptabilityRelativeInCanadaOrStudyInCanada(relativeInCanada);

		System.out.println("Have you studied in Canada for atleast 2 years (Y/N) ");
		String studyInCanada = sc.next();

		// invoking relativeOrStudyInCanada method
		finalPoints = finalPoints + cp.pointsForAdaptabilityRelativeInCanadaOrStudyInCanada(studyInCanada);

		System.out.println("Have you studied in Canada for atleast 2 years at NOC 0, A, B (Y/N)");
		String workInCanada = sc.next();

		// invoking relativeOrStudyInCanada method
		finalPoints = finalPoints + cp.pointsForAdaptabilityWorkInCanada(workInCanada);

		System.out.println("Total points: " + finalPoints);

		if (finalPoints >= 67) {
			System.out.println("You are eligible to submit an Expression of Interest (EOI) to Immigration Canada");
		} else {
			System.out.println("You are not eligible to submit an Expression of Interest (EOI) to Immigration Canada");
		}
	}

}
