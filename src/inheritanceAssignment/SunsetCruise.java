package inheritanceAssignment;

public class SunsetCruise extends CruiseDetails{
	
	public String typeOfCruise;
	public double ticketCostOfAdult;
	public double ticketCostOfChild;
	int personsRequireCandleLightDinner;
	public int numberOfDays;
	double costOfCandleLightDinner = 45;
	public SunsetCruise(String typeOfCruise, double ticketCostOfAdult, double ticketCostOfChild, int numberOfDays) {
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
		String candleLightDinnerRequired = "";
		System.out.println("Sunset Cruise has candle light dinner option in the cruise. Do you want to prebook the service at "+costOfCandleLightDinner+" per person for adults");
		candleLightDinnerRequired = sc.next();
		if(candleLightDinnerRequired.equalsIgnoreCase("y")) {
			return true;
		}
		return false;
	}
	
	int getPersonForCandleLightDinner() {
		return personsRequireCandleLightDinner;
		
	}
	
	double calculateCostOfCandleLightDinner() {
		double totalCostOfCandleLightDinner =0;
		if(checkIfCandleLightDinnerRequired()) {
			personsRequireCandleLightDinner = getNoOfAdults();
			totalCostOfCandleLightDinner = personsRequireCandleLightDinner*costOfCandleLightDinner;
		}
		return totalCostOfCandleLightDinner;
		
	}
	
	
	
	
	
	
	

}
