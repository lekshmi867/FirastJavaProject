package javaPraticalInterviewQuestions;

public class ArrayMatching {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 7 };
		int[] arr2 = { 2, 3, 1, 0, 5 ,8};

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					break;
				} else {
					if (j == 4) {
						System.out.println("element not found in array 2 is " + arr1[i]);
					}

				}

			}
		}

	}
}
