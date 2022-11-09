package inheritance;

public class Laptop {

	public String laptopScreenSize = "14.5";

	private void provideLaptopBag() {

		System.out.println("Laptop bag provided");

	}

	void screenSize() {
		System.out.println("Should have a min screen size of 14in");
	}

	void keyboard() {
		System.out.println("Should have a qwerty keyboard");
	}

	public void payingExtraCharge(boolean isPayingExtra) {
		if (isPayingExtra) {
			provideLaptopBag();
		} else {
			System.out.println("Furrrrr");
		}

	}

}