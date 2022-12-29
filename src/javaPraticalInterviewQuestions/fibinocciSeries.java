package javaPraticalInterviewQuestions;

import java.util.Scanner;

public class fibinocciSeries {

	public static void main(String[] args) {
		int f1=0,f2=1,f;
		  Scanner myObj = new Scanner(System.in);
		  System.out.println("Enter the lenght of the series to be displayed");
		  int n = myObj.nextInt();
		  System.out.println(f1+"\n"+f2);
		  for(int i=2; i<n;i++) {
			  f = f1+f2;
			  f1=f2;
			  f2=f;
			  System.out.println(f);
		  }

	}

}
