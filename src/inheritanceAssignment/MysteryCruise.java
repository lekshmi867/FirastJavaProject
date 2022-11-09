package inheritanceAssignment;

public class MysteryCruise extends CruiseDetails{
	
	public String typeOfCruise;
	public double ticketCostOfAdult;
	public double ticketCostOfChild;
	int personsRequireCasino;
	public int numberOfDays;
	double costOfCasino = 20;
	public MysteryCruise(String typeOfCruise, double ticketCostOfAdult, double ticketCostOfChild, int numberOfDays) {
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
	
	boolean checkIfCasinoRequired() {
		String casinoRequired = "";
		System.out.println("Mystery Cruise has a casino option in the cruise. Do you want to prebook the service at "+costOfCasino+" per person for adults");
		casinoRequired = sc.next();
		if(casinoRequired.equalsIgnoreCase("y")) {
			return true;
			
		}
		return false;
	}
	
	int getPersonForCasino() {
		return personsRequireCasino;
		
	}
	
	double calculateCostOfCasino() {
		double totalCostOfCasino =0;
		if(checkIfCasinoRequired()) {
			personsRequireCasino = getNoOfAdults();
			totalCostOfCasino = personsRequireCasino*costOfCasino;
		}
		return totalCostOfCasino;
		
	}
	
	
	
	
	
	
	

}
