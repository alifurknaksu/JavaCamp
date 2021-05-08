package entities;

import core.entities.abstracts.Dto;

public class UserForRegisterDto implements Dto {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public UserForRegisterDto() {
		
	}

	public UserForRegisterDto(final String firstName,final String lastName,final String email,final String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

}
