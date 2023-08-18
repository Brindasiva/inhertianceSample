package inhertianceSample;

public class Employee extends Person{

private String employeeCompanyName;

private int employeeId;



public Employee() {
	super();
}

public String getEmployeeCompanyName() {
	return employeeCompanyName;
}

public void setEmployeeCompanyName(String employeeCompanyName) {
	this.employeeCompanyName = employeeCompanyName;
}

public int getEmployeeId() {
	return employeeId;
}

public Employee(String employeeCompanyName, int employeeId) {
	super();
	this.employeeCompanyName = employeeCompanyName;
	this.employeeId = employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

}
