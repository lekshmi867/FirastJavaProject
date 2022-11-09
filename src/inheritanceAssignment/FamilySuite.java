package inheritanceAssignment;

public class FamilySuite extends HotelDetails{
	private String typeOfRoom;
	private int maximumNoOfAdultsAllowed;
	private int maximumNoOfChildAllowed;
	private double roomCost;
	public FamilySuite(String typeOfRoom, int maximumNoOfAdultsAllowed, int maximumNoOfChildAllowed, double roomCost) {
		super();
		this.typeOfRoom = typeOfRoom;
		this.maximumNoOfAdultsAllowed = maximumNoOfAdultsAllowed;
		this.maximumNoOfChildAllowed = maximumNoOfChildAllowed;
		this.roomCost = roomCost;
	}
	public String getTypeOfRoom() {
		return typeOfRoom;
	}
	public int getMaximumNoOfAdultsAllowed() {
		return maximumNoOfAdultsAllowed;
	}
	public int getMaximumNoOfChildAllowed() {
		return maximumNoOfChildAllowed;
	}
	public double getRoomCost() {
		return roomCost;
	}
	
}