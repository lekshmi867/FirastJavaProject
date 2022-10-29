package stringMethods;

import java.util.Arrays;

public class MyName {

	public static void main(String[] args) {
		String fullName = "Lekshmi Vijayan";
//Split first name and last using method split
		String[] nameList = fullName.split(" ");
		String firstName = nameList[0];
		String lastName = nameList[1];
		System.out.println("The length of the name is "+fullName.length());
		System.out.println("First name is " + firstName);
		System.out.println("Last name is " + lastName);
//Last name with *
		int index = fullName.indexOf("Vijayan");
		String lastNameWithAsterisk = fullName.substring(index).replaceAll("\\w", "*");
		System.out.println("Name with last name replaced with * " + firstName + " " + lastNameWithAsterisk);
		System.out.println("Replace all occurence of  a with e "+fullName.replace("a", "e"));

	}

}
