package javaPraticalInterviewQuestions;

public class removeSecondCharacterofEveryWord {

	public static void main(String[] args) {
		String sentence = "Interview Question";
		String[] wordArray = sentence.split(" ");

		for (int i = 0; i < wordArray.length; i++) {
			char[] charArray = wordArray[i].toCharArray();
			char[] newArray = new char[charArray.length-1];
			
			for(int j=0, k=0; j<charArray.length;j++) {
				if(j==1) {
					continue;
				}
				else {
					newArray[k]=charArray[j];
				}
				k++;
			}
			System.out.println(String.valueOf(newArray));
		}
		
	}
}
