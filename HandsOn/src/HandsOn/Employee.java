package HandsOn;

public class Employee {
	
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeeePhone;
	protected double basicSalary;
	private double specialAllowance = 250.80;
	private double hra = 1000.50;
	/*
	 * private long Id; private String Name; private String Address; private long
	 * Phone;
	 */
	
	void empFunction() {
		System.out.println("This is the empoloyee function.");
	}
	//Calculate function creation.
	 double calculateSalary() {
		double salary;
		
		salary= basicSalary +((basicSalary*specialAllowance)/100)+((basicSalary*hra)/100);
		//System.out.println(salary);
		return salary;	
	}
	
	double calculateTransportAllowance() {
		
		double transportAllowance;
		
		transportAllowance = basicSalary*10/100;
		
		return transportAllowance;
	}

	public Employee(long employeeId, String employeeName, String employeeAddress, long employeeePhone,
			double basicSalary, double specialAllowance, double hra) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeePhone = employeeePhone;
		this.basicSalary = basicSalary;
		this.specialAllowance = specialAllowance;
		this.hra = hra;
	}
	
	public Employee(long Id, String Name, String Address, long Phone) {
		super();
		Id = employeeId;
		Name = employeeName;
		Address = employeeAddress;
		Phone = employeeePhone;
	}
	
	
	/*
	 * @Override public String toString() { return "Employee [employeeId=" +
	 * employeeId + ", employeeName=" + employeeName + ", employeeAddress=" +
	 * employeeAddress + ", employeeePhone=" + employeeePhone + ", basicSalary=" +
	 * basicSalary + ", specialAllowance=" + specialAllowance + ", hra=" + hra +
	 * ", calculateSalary()=" + calculateSalary() + ", getClass()=" + getClass() +
	 * ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]"; }
	 */
	
	
	  
	  
	
	
}
