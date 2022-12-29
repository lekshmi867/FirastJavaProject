package collection;

import java.util.HashMap;
import java.util.Map;

import java.util.Iterator;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> userAccount = new HashMap<String, String>();
		userAccount.put("41567897", "1234");
		userAccount.put("51348756", "5678");
		userAccount.put("81370923", "2345");

		Iterator <String> it = userAccount.keySet().iterator();        
		while(it.hasNext())  
		{  
		String key=it.next();  
		System.out.println("Account: "+key+"     pin: "+userAccount.get(key));  
		} 
	}

}
