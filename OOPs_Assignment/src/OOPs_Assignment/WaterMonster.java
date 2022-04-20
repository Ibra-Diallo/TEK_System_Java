package OOPs_Assignment;

public class WaterMonster extends Monster{

	
	private String name2;
	
	public WaterMonster(String name2) {
		super(name2);
		// TODO Auto-generated constructor stub
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	@Override
	public String toString() {
		return "WaterMonster [name2=" + name2 + "]";
	}

}
