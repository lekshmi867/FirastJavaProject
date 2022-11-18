package inheritanceModification;

public class ScenicCruise extends CruiseDetails{
	int adultsRequiredSpa;
	double costOfSpa = 50;
	public ScenicCruise(String typeOfCruise, double ticketCostOfAdult, double ticketCostOfChild, int numberOfDays) {
		super(typeOfCruise,ticketCostOfAdult,ticketCostOfChild, numberOfDays);
	}
	
	int getAdultsForSpa() {
		return adultsRequiredSpa;		
	}
	
	double calculateCostofSpa() {
		double totalCostOfSpa =0;
		System.out.println("Scenic Cruise has Spa Services in the cruise. Do you want to prebook the service at "+costOfSpa+" per person for adults");
		String spaRequired = sc.next();
		if(spaRequired.equalsIgnoreCase("y")) {
		adultsRequiredSpa = getNoOfAdults();
		totalCostOfSpa = adultsRequiredSpa*costOfSpa;
		}
		return totalCostOfSpa;	
	}

}
