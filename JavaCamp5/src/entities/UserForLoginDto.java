package entities;

import core.entities.abstracts.Dto;

public class UserForLoginDto implements Dto {
	private String email;
	private String password;
	
	public UserForLoginDto(final String email,final String password) {
		this.email = email;
		this.password = password;
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
