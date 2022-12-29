package javaInterview;

import java.util.Random;

public class generateRandomEmail {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int randomNumber = rand.nextInt(999);
		
		System.out.println("Random email is "+randomNumber+"@gmail.com");

	}

}
