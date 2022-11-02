package stringMethods;

public class MyName {

	public static void main(String[] args) {
		String fullName = "Lekshmi Vijayan";
		//Split first name and last using method split
		String[] nameList = fullName.split(" ");
		String frstName = nameList[0];
		String lstName = nameList[1];
		System.out.println("The length of the name is "+fullName.length());
		System.out.println("First name is " + frstName);
		System.out.println("Last name is " + lstName);
		//Last name with *
		int index = fullName.indexOf(lstName);
		String lstNameWithAsterisk = fullName.substring(index).replaceAll("\\w", "*");
		System.out.println("Full name with last name replaced with * " + frstName + " " + lstNameWithAsterisk);
		System.out.println("Replace all occurance of  a with e "+fullName.replace("a", "e"));
		
		//using lastIndexof
		int lastIndexofFirstName = fullName.lastIndexOf(" ");
		String firstName = fullName.substring(0, lastIndexofFirstName);
		System.out.println("First name is " + firstName);
		String lastName = fullName.substring(lastIndexofFirstName);
		System.out.println("Last name is " + lastName);
		System.out.println("The length of the name is " + fullName.length());
		String lastNameWithAsterisk = lastName.replaceAll("\\w", "*");
		System.out.println("Full name with last name replaced with * " + firstName + " " + lastNameWithAsterisk);
		System.out.println("Replace all occurance of  a with e " + fullName.replace("a", "e"));
		System.out.println(fullName.toCharArray());
	}

}
