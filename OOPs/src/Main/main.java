 package Main;

public class main {

	public static void main(String[] args) {
		
		//object and memory slide 14,10,8;
		
		Employee empOne = new Employee("Ibrahima", "Diallo", "Full Stack Developper", 21196);
		Employee empTwo = new Employee("Avani", "Dhalgara", "Full Stack Developper", 22018);
		Employee empThree = new Employee("Abdifatah","Web Designer", 21234);
	
		Manager managerOne = new Manager("Youssouph", "Diallo","Manager", 10126,"Sales Timecard");
		managerOne.setFirstName(" Youssuph ");
		managerOne.setLastName(" Diallo ");
		
		
		System.out.println(empOne);
		System.out.println(empTwo);
		System.out.println(empThree);
		System.out.println(managerOne);
		System.out.println("manager"+managerOne.getFirstName()+managerOne.getLastName());
		
		
		
		

	}

}
