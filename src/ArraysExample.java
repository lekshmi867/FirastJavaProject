
public class ArraysExample {

	public static void main(String[] args) {

		int[] ageList = { 20, 21, 23, 25 };
		String[] nameList = { "Shanthi", "Lekshmi", "Parul", "Rajbir" };

		System.out.println("Names in the list is ");
		for (int name = nameList.length; name > 0; name--) {
			System.out.println(nameList[name - 1]);
		}

		// System.out.println("My name is " + nameList[1] + ". I am " + (ageList[4] +
		// ageList[1]) + " years old");
	}

}
