package javaPraticalInterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		Map<Integer, String> account = new HashMap<>();
		account.put(9,"meenu");
		account.put(2,"lekshmi");
		account.put(7,"raju");
		account.put(4,"netra");
		
		ArrayList<Integer> sortedKey = new ArrayList<>(account.keySet());
		Collections.sort(sortedKey);
		
		for(int x: sortedKey) {
			System.out.println("key is "+x+" value is "+account.get(x));
		}

	}

}
