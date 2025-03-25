package task01.app;

import java.time.LocalDate;

public class User {

	private String firstName;
	private String lastName;
	private String userName;
	private LocalDate dateOfBirth;
	private Boolean status;
	
	public User(String firstName, String lastName, String userName, LocalDate dateOfBirth, Boolean status) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.dateOfBirth = dateOfBirth;
		this.status = status;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getUserName() {
		return userName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public Boolean getStatus() {
		return status;
	}
	
	public String getStatusText() {
		return status ? "Aktív" :"Inaktív";
	}
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", dateOfBirth="
				+ dateOfBirth + ", status=" + status + "]";
	}
	
	public String toStringDivider() {
		return "Keresztnév: " + firstName + ", Vezetéknév: " + lastName  + ", Felhasználónév: " + userName + ", Születési dátum: " + dateOfBirth + ", Állapot: " + getStatusText(); 
	}
}
