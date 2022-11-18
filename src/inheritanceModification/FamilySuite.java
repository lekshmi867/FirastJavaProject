package inheritanceModification;

public class FamilySuite extends HotelDetails {
	private int maximumNoOfAdultsAllowed;
	private int maximumNoOfChildAllowed;

	public FamilySuite(String typeOfRoom, int maximumNoOfAdultsAllowed, int maximumNoOfChildAllowed, double roomCost) {
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