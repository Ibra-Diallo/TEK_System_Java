package OOPs_Assignment;

public class FireMonster extends Monster {
	
	private String name1;
	
	public FireMonster(String name1) {
		super(name1);
		
	}

	public String getName() {
		return name1;
	}

	public void setName(String name1) {
		this.name1 = name1;
	}

	@Override
	public String toString() {
		return "FireMonster [name=" + name + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
