package inheritanceAssignment;

public class ScenicCruise extends CruiseDetails{
	
	public String typeOfCruise;
	public double ticketCostOfAdult;
	public double ticketCostOfChild;
	int adultsRequiredSpa;
	public int numberOfDays;
	double costOfSpa = 50;
	public ScenicCruise(String typeOfCruise, double ticketCostOfAdult, double ticketCostOfChild, int numberOfDays) {
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
	
	boolean checkIfSpaRequired() {
		String spaRequired = "";
		System.out.println("Scenic Cruise has Spa Services in the cruise. Do you want to prebook the service at "+costOfSpa+" per person for adults");
		spaRequired = sc.next();
		if(spaRequired.equalsIgnoreCase("y")) {
			return true;
		}
		return false;
	}
	
	int getAdultsForSpa() {
		
//		adultsRequiredSpa = getNoOfAdults();
		return adultsRequiredSpa;
		
	}
	
	double calculateCostofSpa() {
		double totalCostOfSpa =0;
		if(checkIfSpaRequired()) {
			adultsRequiredSpa = getNoOfAdults();
			totalCostOfSpa = adultsRequiredSpa*costOfSpa;
		}
		return totalCostOfSpa;
		
	}
	
	
	
	
	
	
	

}
