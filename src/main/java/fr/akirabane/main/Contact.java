package fr.akirabane.main;

public class Contact {
	
	private String lastname;
	private String firstname;
	
	private String phoneNumber;
	
	public Contact(String lastName, String firstName, String phoneNumber) {
		this.lastname = lastName;
		this.firstname = firstName;
		this.phoneNumber = phoneNumber;
	}
	
	//Getters & Setters
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return getFirstname() + " " + getLastname() + " " + getPhoneNumber();
	}

}
