package inheritanceModification;

public class MysteryCruise extends CruiseDetails{
	int personsRequireCasino;
	double costOfCasino = 20;
	public MysteryCruise(String typeOfCruise, double ticketCostOfAdult, double ticketCostOfChild, int numberOfDays) {
		super(typeOfCruise,ticketCostOfAdult,ticketCostOfChild, numberOfDays);
	}
	int getPersonForCasino() {
		return personsRequireCasino;	
	}
	
	double calculateCostOfCasino() {
		double totalCostOfCasino =0;
		System.out.println("Mystery Cruise has a casino option in the cruise. Do you want to prebook the service at "+costOfCasino+" per person for adults");
		String casinoRequired = sc.next();
		if(casinoRequired.equalsIgnoreCase("y")) {
			personsRequireCasino = getNoOfAdults();
			totalCostOfCasino = personsRequireCasino*costOfCasino;
		}
		return totalCostOfCasino;	
	}
}
