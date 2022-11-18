package inheritanceModification;
public class SunsetCruise extends CruiseDetails{
	private int personsRequireCandleLightDinner;
	private double costOfCandleLightDinner = 45;
	public SunsetCruise(String typeOfCruise, double ticketCostOfAdult, double ticketCostOfChild, int numberOfDays) {
		super(typeOfCruise,ticketCostOfAdult,ticketCostOfChild, numberOfDays);
	}
	int getPersonForCandleLightDinner() {
		return personsRequireCandleLightDinner;
		}

	double calculateCostOfCandleLightDinner() {
		double totalCostOfCandleLightDinner =0;
		System.out.println("Sunset Cruise has candle light dinner option in the cruise. Do you want to prebook the service at "+costOfCandleLightDinner+" per person for adults");
		String candleLightDinnerRequired = sc.next();
		if(candleLightDinnerRequired.equalsIgnoreCase("y")) {
			personsRequireCandleLightDinner = getNoOfAdults();
			totalCostOfCandleLightDinner = personsRequireCandleLightDinner*costOfCandleLightDinner;
		}
		return totalCostOfCandleLightDinner;		
	}
}
