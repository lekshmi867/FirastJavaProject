import java.util.Scanner;

public class NumbersToAlphabet {

	public static void main(String[] args) {
		int numArray[] = {0, 1, 2, 3, 4, 5};
		char alphbetArray[]= {'a','b','c','d','e','f'};
		int index=0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0;i<numArray.length;i++) {
			if(numArray[i]==num) {
				index = i;
				break;
			}
		}
		
		System.out.println("The corresponding match for the number "+num+ " is "+alphbetArray[index]);
	}

}
