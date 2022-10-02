
public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 8;
		int num3 = 1;

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("The largest number is \n" + num1);
			} else {
				System.out.println("The largest number is \n" + num3);
			}

		} else if (num2 > num3) {
			System.out.println("The largest number is \n" + num2);
		} else {
			System.out.println("The largest number is \n" + num3);
		}

	}

}
