package com.app.milkbank.payload.request;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
	@NotBlank
	private String useremail;

	@NotBlank
	private String password;

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
