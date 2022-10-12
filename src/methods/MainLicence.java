package methods;

import java.util.Scanner;

public class MainLicence {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the current license");
		String currentLicense = sc.nextLine();
		
		LicenceCategory lc = new LicenceCategory();
		String licenseClass = lc.licenceType(currentLicense);
		
		switch (licenseClass) {
	
		case "G1":
			System.out.println("You can apply for G1 and the total cost is $150");
			break;
		case "G2":
			System.out.println("You can apply for G2 and the total cost is $160");
			break;
		case "G":
			System.out.println("You can apply for G and the total cost is $160");
			break;
		case "Already have a license":
			System.out.println("You Already have a license");
			break;

		default:
			System.out.println("Inalid Option");
			break;
		}
	}

}
