package aspecj.learn.curve.udemy_hands_on;

public class Account {
	String firstName;
	String lastName;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
