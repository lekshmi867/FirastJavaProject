package javaPraticalInterviewQuestions;
public class stringIsASubstring {

	public static void main(String[] args) {
		// create a string
	    String txt = "This is Programiz";
	    String str1 = "Programiz";
	   
	    if(txt.contains(str1)) {
	      System.out.println(str1 + " is present in the string.");
	    }
	    else {
	      System.out.println(str1 + " is not present in the string.");
	    }


	}

}
