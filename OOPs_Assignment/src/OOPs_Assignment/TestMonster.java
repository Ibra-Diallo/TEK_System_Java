package OOPs_Assignment;

public class TestMonster {

	public static void main(String[] args) {
		
		Monster m1 = new FireMonster(null);
		Monster m2 = new WaterMonster(null);
		Monster m3 = new StoneMonster(null);
		
		m1.attack("Fire");
		m2.attack("Water");
		m2.attack("Stone");
		

	}

}
