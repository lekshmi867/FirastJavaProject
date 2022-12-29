package compositionEmployeeExample;

import java.util.Scanner;

public class BankEmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		Bank bank = new Bank();
		Employee emp1 = new Employee("Lekshmi", 19, "clerk");
		Employee emp2 = new Employee("Ishitha", 25, "manager");
		Employee emp3 = new Employee("Jeeva", 11, "assistantManager");
		Employee emp4 = new Employee("Jeni", 31, "finacialAdvisor");
		Employee emp5 = new Employee("Geetha", 9, "clerk");
		Employee emp6 = new Employee("Amith", 12, "systemAdmin");
		Employee emp7 = new Employee("Meenu", 23, "teller");
		Employee emp8 = new Employee("Nayana", 16, "clerk");
		Employee emp9 = new Employee("Netra", 38, "teller");
		Employee emp10 = new Employee("parvathy", 10, "cashier");

		bank.addEmployeetoBank(emp1);
		bank.addEmployeetoBank(emp2);
		bank.addEmployeetoBank(emp3);
		bank.addEmployeetoBank(emp4);
		bank.addEmployeetoBank(emp5);
		bank.addEmployeetoBank(emp6);
		bank.addEmployeetoBank(emp7);
		bank.addEmployeetoBank(emp8);
		bank.addEmployeetoBank(emp9);
		bank.addEmployeetoBank(emp10);

		System.out.println("Please enter the employee name");

		String employeeName = sc.next();
		bank.getRequestedEmployeeDetails(employeeName);
		

	}

}
