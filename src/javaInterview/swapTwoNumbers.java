package javaInterview;

public class swapTwoNumbers {

	public static void main(String[] args) {
		int a =5;
		int b = 10;
		
		System.out.println("Values before swap "+a+" "+ b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("values after swap is "+a+" "+b);

	}

}
