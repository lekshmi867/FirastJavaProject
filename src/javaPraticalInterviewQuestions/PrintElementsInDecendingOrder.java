package javaPraticalInterviewQuestions;
import java.util.Scanner;

public class PrintElementsInDecendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		System.out.println("Enter the array elements");
		int[] arrayElements = new int[arraySize];
		for(int i=0; i<arraySize;i++) {
			arrayElements[i]=sc.nextInt();
		}
		System.out.println("Elements in descending order is");
		for (int i = arrayElements.length-1; i>=0; i--) {
			System.out.println(arrayElements[i]);
		}

	}

}
