package javaPraticalInterviewQuestions;

import java.util.ArrayList;

public class RemoveFirstCharFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("lekshmi");
		arrayList.add("neethu");
		arrayList.add("Isha");
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).substring(1));
			
		}
		

	}

}
