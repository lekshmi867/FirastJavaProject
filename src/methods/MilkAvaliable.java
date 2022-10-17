package methods;

public class MilkAvaliable {

	int numberOfPacketsAvailable = 10;

	boolean isMilkAvailablein(int numberOfPacketsEntered) {
		if (numberOfPacketsAvailable >= numberOfPacketsEntered) {
			return true;
		}
		return false;
	}
}
