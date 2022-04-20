package OOPs_Assignment;

public class Monster {
	
	public String name;
	
	public void attack(String name1) {
		System.out.println("Attack with "+ name1);	
	}
	public Monster(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
