package OOPs_Assignment;

public class StoneMonster extends Monster{
	
	private String name3;
	
	public StoneMonster(String name3) {
		super(name3);
	}
	public String getName3() {
		return name3;
	}
	public void setName3(String name3) {
		this.name3 = name3;
	}
	@Override
	public String toString() {
		return "StoneMonster [name3=" + name3 + "]";
	}

}
