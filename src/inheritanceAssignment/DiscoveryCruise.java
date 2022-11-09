package inheritanceAssignment;

public class DiscoveryCruise extends CruiseDetails{
	
	public String typeOfCruise;
	public double ticketCostOfAdult;
	public double ticketCostOfChild;
	int personsRequireAdventureGame;
	public int numberOfDays;
	double costOfAdventureGame = 50;
	public DiscoveryCruise(String typeOfCruise, double ticketCostOfAdult, double ticketCostOfChild, int numberOfDays) {
		super();
		this.typeOfCruise = typeOfCruise;
		this.ticketCostOfAdult = ticketCostOfAdult;
		this.ticketCostOfChild = ticketCostOfChild;
		this.numberOfDays = numberOfDays;
	}
	public String getTypeOfCruise() {
		return typeOfCruise;
	}


	public double getTicketCostOfAdult() {
		return ticketCostOfAdult;
	}


	public double getTicketCostOfChild() {
		return ticketCostOfChild;
	}


	public int getNumberOfDays() {
		return numberOfDays;
	}
	
	boolean checkIfCandleLightDinnerRequired() {
		String adventureGameRequired = "";
		System.out.println("Discovery Cruise has adventure game option. Do you want to prebook the service at "+costOfAdventureGame+" per person for adults");
		adventureGameRequired = sc.next();
		if(adventureGameRequired.equalsIgnoreCase("y")) {
			return true;
		}
		return false;
	}
	
	int getPersonForAdventureGame() {
		return personsRequireAdventureGame;
		
		
	}
	
	double calculateCostOfAdventureGame() {
		double totalCostOfAdventureGame =0;
		if(checkIfCandleLightDinnerRequired()) {
			personsRequireAdventureGame = getNoOfAdults();
			totalCostOfAdventureGame = personsRequireAdventureGame*costOfAdventureGame;
		}
		return totalCostOfAdventureGame;
		
	}
	
	
	
	
	
	
	

}
