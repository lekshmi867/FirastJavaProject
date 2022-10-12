package arrays;

import java.util.Scanner;

public class ComapreCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nameList = new String[6];
		int counter = 0;
		int counter1 = 0;
		int f=0;
		System.out.println("Enter the names");
		for (int i = 0; i < nameList.length; i++) {
			nameList[i] = sc.nextLine();
		}

		System.out.println("Enter the first name to be checked in the list");
		String nameSearch1 = sc.next();

		System.out.println("Enter the second name to be checked in the list");
		String nameSearch2 = sc.next();

		for (int i = 0; i < nameList.length; i++) {
			if (nameList[i].equals(nameSearch1)) {
				System.out.println("The name 1  found at index " + i);
				counter++;
			} else {
				if (nameList[i].equals(nameSearch2)) {
					System.out.println("The name 2  found at index " + i);
					counter1++;
				}
				else {
					f=1;
				}
			}

		}
		if(f==1) {
			System.out.println("Number of times name " + nameSearch1 + " and " + nameSearch2 + " appeared in the list is "
					+ counter + " and " + counter1);
			
		}
		else
		{
			System.out.println("No match");
		}

		
	}
}
