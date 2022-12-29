package compositionEmployeeExample;

public class Employee {

	private String employeeName;
	private int employeeID;
	private String designation;
	public Employee(String name, int employeeID, String designation) {
		super();
		this.employeeName = name;
		this.employeeID = employeeID;
		this.designation = designation;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public String getDesignation() {
		return designation;
	}
}
