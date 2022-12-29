package javaPraticalInterviewQuestions;

import java.util.ArrayList;

public class reverseAnArrayList {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("lekshmi");
		nameList.add("swaroop");
		nameList.add("ishitha");
		nameList.add("meenu");

		System.out.println("Arraylist before reversing is " + nameList);
		for(int i=nameList.size()-1; i>=0;i--) {
			System.out.println(nameList.get(i));
		}
	}

}
