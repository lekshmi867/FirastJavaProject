package javaPraticalInterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestNumberInArray {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of the array");
//		int size = sc.nextInt();
//		int[] array = new int[size];
//		System.out.println("Enter the array elements");
//		for (int i = 0; i < array.length; i++) {
//			array[i] = sc.nextInt();
//		}
//		int largest = array[0];
//		for (int i = 0; i < array.length; i++) {
//			if(array[i]>largest) {
//				largest = array[i];
//			}
//		}
//		System.out.println("The largest number is "+largest);
		
		ArrayList<Integer> intArray = new ArrayList<>();
		intArray.add(6);
		intArray.add(16);
		intArray.add(19);
		intArray.add(5);
		intArray.add(4);
		
		int largest = intArray.get(0);
		
		for(int i=0;i<intArray.size();i++) {
			if(intArray.get(i)>largest) {
				largest = intArray.get(i);
			}
		}
		System.out.println("The largest element is "+largest);
		
		Collections.sort(intArray);
		System.out.println("Elements in sorted order is"+intArray);
		System.out.println("Second largest element is "+intArray.get(intArray.size()-2));
	}
}
