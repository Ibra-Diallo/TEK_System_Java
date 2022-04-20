package Main;

public class Manager extends Employee {
	
	
	private String timeCards;
	
	
	public Manager(String firstName, String lastName, String jobTitle, long emplId, String timeCards) {
		super(firstName, lastName, jobTitle, emplId);
		this.timeCards = timeCards;
	}


	public String getTimeCards() {
		return timeCards;
	}


	public void setTimeCards(String timeCards) {
		this.timeCards = timeCards;
	}


	@Override
	public String toString() {
		return "Manager [timeCards= " + timeCards  + ", FirstName="
				+ getFirstName() + ",LastName=" + getLastName() + ", JobTitle=" + getJobTitle()
				+ ",EmplId=" + getEmplId() +  "]";
	}


	

	
	
	

}
