package inheritanceAssignment;

public class DeluxSuite extends HotelDetails{
	public String typeOfRoom;
	public int maximumNoOfAdultsAllowed;
	public int maximumNoOfChildAllowed;
	public double roomCost;
	public DeluxSuite(String typeOfRoom, int maximumNoOfAdultsAllowed, int maximumNoOfChildAllowed, double roomCost) {
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
