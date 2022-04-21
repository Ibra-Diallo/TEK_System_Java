package HandsOn;

public class InheritanceActivity {

	public static void main(String[] args) {
		
		Managers manager = new Managers(126534, "Peter", "Chennai India", 237844, 65000);
		
		Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		
		/*
		 * System.out.println("This manager information is:\n");
		 * System.out.println(manager1);
		 */
		double managerYearlySalary = manager.calculateSalary(); 
		double traineeYearlySalary = trainee.calculateSalary();
		double managerTransAllowance = manager.calculateTransportAllowance();
		double traineeTransAllowance = trainee.calculateTransportAllowance();
		
		System.out.print("Manager salary: $");
		System.out.println(managerYearlySalary);
		System.out.println(" ");
		System.out.print("Trainee salary: $");
		System.out.println(traineeYearlySalary);
		System.out.println(" ");
		System.out.print("Manager transport allowance: $");
		System.out.println(managerTransAllowance);
		System.out.println(" ");
		System.out.print("Trainee transport allowance: $");
		System.out.println(traineeTransAllowance);

	}

}
