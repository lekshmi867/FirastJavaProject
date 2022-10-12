package methodAssignment;

public class CRSPointCalculator {
	// Method for Educational Qualification
	int educationalQualification(int choice) {
		int points = 0;

		switch (choice) {
		case 1:
			points = points + 25;
			break;
		case 2:
			points = points + 23;
			break;
		case 3:
			points = points + 22;
			break;
		case 4:
			points = points + 21;
			break;

		default:
			points = 0;
			break;
		}
		return points;

	}

	// Method for Experience
	int experience(double years) {

		int points = 0;

		if ((years >= 4) && (years <= 5)) {
			points = points + 13;
		} else if (years >= 6) {
			points = points + 15;
		} else {
			points = 0;
		}
		return points;
	}

	// method for age of that applicant
	int age(int years) {
		int points = 0;
		if ((years >= 18) && (years <= 35)) {
			points = points + 12;
		} else {
			switch (years) {
			case 36:
				points = points + 11;
				break;
			case 37:
				points = points + 10;
				break;
			case 38:
				points = points + 9;
				break;
			case 39:
				points = points + 8;
				break;
			case 40:
				points = points + 7;
				break;
			case 41:
				points = points + 6;
				break;
			case 42:
				points = points + 5;
				break;
			case 43:
				points = points + 4;
				break;
			case 44:
				points = points + 3;
				break;
			case 45:
				points = points + 2;
				break;
			case 46:
				points = points + 1;
				break;
			case 47:
				points = points + 0;
				break;
			default:
				points = 0;
				break;
			}
		}
		return points;
	}

	// Method for IELTS
	int ieltsListeningScore(double score) {
		int points = 0;
		if (score >= 8) {
			points = points + 6;
		} else if (score == 7.5) {
			points = points + 5;
		} else {
			points = 0;
		}
		return points;

	}

	// Method for reading, writing and speaking score
	int ieltsReadWriteSpeakScore(double score) {
		int points = 0;
		if (score >= 7) {
			points = points + 6;
		} else if (score == 6.5) {
			points = points + 5;
		} else {
			points = 0;
		}
		return points;

	}

	//Method for relative in canada or study in canada
	int relativeOrStudyInCanada(String option) {
		int points = 0;
		if (option.equalsIgnoreCase("y")) {
			points = points + 5;
		} else {
			points = 0;
		}
		return points;

	}
	
	//Method for work in canada
	int workInCanada(String option) {
		int points = 0;
		if (option.equalsIgnoreCase("y")) {
			points = points + 10;
		} else {
			points = 0;
		}
		return points;

	}

}
