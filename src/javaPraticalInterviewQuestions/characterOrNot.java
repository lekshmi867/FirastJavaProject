package javaPraticalInterviewQuestions;

public class characterOrNot {

	public static void main(String[] args) {

		char ch ='A';
		
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			 System.out.println("It's an alphabet");
		}
		else {
			System.out.println("Not an alphabet");
		}

	}

}
