package Main;

public class Employee {
	
	private String firstName, lastName, jobTitle;
	private long emplId;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String jobTitle, long emplId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.emplId = emplId;
	}
	
	public Employee(String firstName, String jobTitle, long emplId) {
		
		this.firstName = firstName;
		this.jobTitle = jobTitle;
		this.emplId = emplId;
	}
	
	public Employee(String firstName, long emplId) {
		super();
		this.firstName = firstName;
	//	this.lastName = lastName;
		this.emplId = emplId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public long getEmplId() {
		return emplId;
	}
	public void setEmplId(long emplId) {
		this.emplId = emplId;
	}
	
	@Override
	public String toString() {
		return "Employee ["
				+ "firstName = " + firstName +", " + 
				(lastName !=null?("lastName = "+ lastName+", ") : "") + 
			    (jobTitle != null?("jobTitle = " + jobTitle+", ") : "") +
				"emplId = " + emplId  + "]";
	}
	
	//Other methods

}
