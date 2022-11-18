package inheritanceModification;

public class DeluxSuite extends HotelDetails{
	public int maximumNoOfAdultsAllowed;
	public int maximumNoOfChildAllowed;
	public DeluxSuite(String typeOfRoom, int maximumNoOfAdultsAllowed, int maximumNoOfChildAllowed, double roomCost) {
		super(typeOfRoom, maximumNoOfAdultsAllowed, maximumNoOfChildAllowed, roomCost);
		this.maximumNoOfAdultsAllowed = maximumNoOfAdultsAllowed;
		this.maximumNoOfChildAllowed = maximumNoOfChildAllowed;
	}
	public int getMaximumNoOfAdultsAllowed() {
		return maximumNoOfAdultsAllowed;
	}
	public int getMaximumNoOfChildAllowed() {
		return maximumNoOfChildAllowed;
	}	
}
