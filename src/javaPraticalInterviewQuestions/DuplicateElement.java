package javaPraticalInterviewQuestions;

import java.util.Arrays;

public class DuplicateElement {
	public static void main(String[] args) {

		//int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		char[] arr = new char[] {'a', 'c', 'a','c','d'};
		Arrays.sort(arr);
		int length = arr.length;
		char[] temp = new char[length];

		int j = 0;
		for (int i = 0; i < length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[length - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		
		for(int i=0; i<j ; i++){
			System.out.println(arr[i]);
		}
	}
}
