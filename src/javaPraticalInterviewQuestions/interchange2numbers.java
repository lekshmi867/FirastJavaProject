package javaPraticalInterviewQuestions;

public class interchange2numbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		System.out.println("numbers before interchange is a= " + a + " b= " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("numbers before interchange is a= " + a + " b= " + b);

	}

}
