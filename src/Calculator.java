/*Build a calculator application which uses a switch case.
*/
public class Calculator {

	public static void main(String[] args) {
		
		int num1=8, num2=4, result;
		char operator = '*';
		
		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.println("Sum of two numbers "+num1+" and "+num2+" is "+result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println("Subtraction of two numbers "+num1+" and "+num2+" is "+result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println("Multiplication of two numbers "+num1+" and "+num2+" is "+result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println("Division of two numbers  "+num1+" and "+num2+" is "+result);
			break;
		case '%':
			result = num1 % num2;
			System.out.println("Modulus of two numbers  "+num1+" and "+num2+" is "+result);
			break;
		default:
			System.out.println("Invalid Option");
			break;
		}
		


	}

}
