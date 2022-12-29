package javaPraticalInterviewQuestions;
import java.util.Arrays;
import java.util.Scanner;

public class sortAnArray {

	public static void main(String[] args) {
		System.out.println("Enter the array size");
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] arrayElements = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			arrayElements[i] = sc.nextInt();
		}
		System.out.println("Elements in sorted order is ");
		int temp =0;
		for (int i = 0; i < arraySize; i++) {
			for (int j = i+1; j < arraySize; j++) {
				if(arrayElements[i]>arrayElements[j]) {
					temp = arrayElements[i];
					arrayElements[i]=arrayElements[j];
					arrayElements[j]=temp;
				}
				
			}
			
		}
//		for (int i = 0; i < arraySize; i++) {
//			System.out.println(arrayElements[i]);
//		}
		System.out.println(Arrays.toString(arrayElements));

	}

}
