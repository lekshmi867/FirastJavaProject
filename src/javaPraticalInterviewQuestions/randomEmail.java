package javaPraticalInterviewQuestions;

import java.util.Random;

public class randomEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int ramdomNumber = rand.nextInt(900)+100;
		System.out.println("Random email id is "+ramdomNumber+"@gmail.com");
	}

}
