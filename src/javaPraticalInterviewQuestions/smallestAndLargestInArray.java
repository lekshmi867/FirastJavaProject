package javaPraticalInterviewQuestions;
import java.util.Scanner;

public class smallestAndLargestInArray {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		System.out.println("Enter the array elements");
		int[] arrayElements = new int[arraySize];
		for(int i=0; i<arraySize;i++) {
			arrayElements[i]=sc.nextInt();
		}
		int largest = arrayElements[0];
		int smallest = arrayElements[0];
		
		for(int i=0; i<arraySize;i++) {
			if(arrayElements[i]<smallest) {
				smallest=arrayElements[i];
			}
			else if(arrayElements[i]>largest) {
				largest=arrayElements[i];			}
		}
		
		System.out.println("Smallest element is "+smallest);
		System.out.println("Largest element is "+largest);
	}
}
