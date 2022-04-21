package HandsOn;

public class Managers extends Employee {

	public Managers(long Id, String Name, String Address, long Phone, double salary) {
		super(Id, Name, Address, Phone);
		
		this.basicSalary = salary;
		
	}
	
	double calculateTransportAllowance() {
			
			double transportAllowance;
			
			transportAllowance = (basicSalary*15/100);
			return transportAllowance;
		}

	
	/*
	 * @Override public String toString() { return Id+", "+Name+", ",+Address+", "+
	 * Phone+","+ salary }
	 */
	 
	

}
