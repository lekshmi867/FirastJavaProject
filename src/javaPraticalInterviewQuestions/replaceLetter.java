package javaPraticalInterviewQuestions;

public class replaceLetter {

	public static void main(String[] args) {
		String sentence = "neenu meenu seenu";
		System.out.println(sentence.replace('e', 'o'));

	
		if(sentence.contains("meenu")) {
			System.out.println("Meenu is present in the sentence");
		}
		else
		{
			System.out.println("not present");
		}
		
		
		
	}

}
