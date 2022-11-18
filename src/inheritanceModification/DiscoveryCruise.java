package inheritanceModification;

public class DiscoveryCruise extends CruiseDetails{
	int personsRequireAdventureGame;
	double costOfAdventureGame = 50;
	public DiscoveryCruise(String typeOfCruise, double ticketCostOfAdult, double ticketCostOfChild, int numberOfDays) {
		super(typeOfCruise,ticketCostOfAdult,ticketCostOfChild, numberOfDays);
	}
	public String getTypeOfCruise() {
		return typeOfCruise;
	}	
	int getPersonForAdventureGame() {
		return personsRequireAdventureGame;	
	}
	
	double calculateCostOfAdventureGame() {
		double totalCostOfAdventureGame =0;
		System.out.println("Discovery Cruise has adventure game option. Do you want to prebook the service at "+costOfAdventureGame+" per person for adults");
		String adventureGameRequired = sc.next();
		if(adventureGameRequired.equalsIgnoreCase("y")) {
			personsRequireAdventureGame = getNoOfAdults();
			totalCostOfAdventureGame = personsRequireAdventureGame*costOfAdventureGame;
		}
		return totalCostOfAdventureGame;	
	}	

}
