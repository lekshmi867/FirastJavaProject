package javaPraticalInterviewQuestions;

public class primeBetweenTwointervals {

	public static void main(String[] args) {
		int low = 20;
		int high = 50;

		while (low <= high) {
			boolean isPrime = true;
			for (int i = 2; i < low / 2; i++) {
				if ((low % i) == 0) {
					isPrime = false;
					break;

				}
			}
			if (isPrime && low > 1) {
				System.out.println(low);
			}
			low++;
		}

	}

}
