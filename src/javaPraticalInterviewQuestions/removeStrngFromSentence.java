package javaPraticalInterviewQuestions;

public class removeStrngFromSentence {

	public static void main(String[] args) {
		String sentence = "neenu knows seenu knows meenu";
		String[] stringArray = sentence.split(" ");
		for (int i = 0; i < stringArray.length; i++) {
			String str = stringArray[i];
			System.out.print( str.substring(0, 1) + str.substring(2)+" ");     
			
			
		}
		

	}

	

}
