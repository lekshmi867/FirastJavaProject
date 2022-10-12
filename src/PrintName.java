import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		String name ="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name ");
		
		name = sc.next();
		System.out.println("The name you entered is "+name);
		
	}

}
