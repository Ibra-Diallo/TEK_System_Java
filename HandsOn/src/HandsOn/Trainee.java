package HandsOn;

public class Trainee extends Employee{

	public Trainee(long Id, String Name, String Address, long Phone, double salary) {
		super(Id, Name, Address, Phone);
		
		this.basicSalary = salary;
		// TODO Auto-generated constructor stub
	}

}
