package javaPraticalInterviewQuestions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NString {

	public static void main(String[] args) {
//		ArrayList<String> stringList = new ArrayList<>();
//		stringList.add("Hello");
//		stringList.add("Hello World");
//		stringList.add("Hello My World");
//		stringList.add("Hello My Beautiful World");
//		stringList.add("Twinkle twinkle little star how I wonder what you are");
//		
//	
//		
//		
//		
//		for (int i = 0; i < stringList.size(); i++) {
//			String[] words =stringList.get(i).split(" "); 
//			Collections.reverse(words[0]);
//			
//			if(words.length>2) {
//				//String[] firstWord = stringList.get(i).substring(0);
//			}
//			else {
//				System.out.println(stringList.get(i));
//			}
//			
//		}

		 String str = "Hi how are you geeks";
		 int i = 0;
	        for (i = 0; i < str.length() && str.charAt(i) != ' '; i++)
	            System.out.print(str.charAt(i)) ;
	     
	        // Print middle words
	        String word = "";
	         
	         
	        for (; i < str.length(); i++) {
	     
	            if (str.charAt(i) != ' ')
	                word += str.charAt(i);
	                 
	            else {
	                    System.out.print(new StringBuilder(word).
	                                reverse().toString() + " ");
	                    word = "";
	            }
	        }
	     
	        // Print last word
	        System.out.print(word + " ");
	    }
	}

