package compositionEmployeeExample;

public class Bank {

	private String bankName;
	Employee[] employee = new Employee[10];
	
	public void addEmployeetoBank(Employee employee) {
		for (int i = 0; i < this.employee.length; i++) {
			if (this.employee[i] == null) {
				this.employee[i] = employee;
				break;
			}
		}
	}
	
	public void getRequestedEmployeeDetails(String employeeNameRequested) {
		for (int i = 0; i < employee.length; i++) {
			if (employee[i].getEmployeeName().equalsIgnoreCase(employeeNameRequested)) {
				System.out.println("Employee Id is "+employee[i].getEmployeeID());
				System.out.println("Employee Designation is "+employee[i].getDesignation());
				break;
			}
		}
		
	}
}
