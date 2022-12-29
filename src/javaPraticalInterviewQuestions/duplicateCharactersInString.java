package javaPraticalInterviewQuestions;

public class duplicateCharactersInString {

	public static void main(String[] args) {
		String sentence = "This is a new string";
		char[] charArray = sentence.toCharArray();
		int count;
		for(int i=0;i<charArray.length;i++) {
			count = 1;
			for(int j=1;j<charArray.length;j++){
				if((charArray[i]==charArray[j])&&(charArray[i]!= ' ')) {
					count++;
					charArray[j] = '0'; 
				}
				
			}
			if(count > 1 && charArray[i] != '0') {
				System.out.println(charArray[i]+" occurs "+count);
			}
					
		}
		
	}

}
