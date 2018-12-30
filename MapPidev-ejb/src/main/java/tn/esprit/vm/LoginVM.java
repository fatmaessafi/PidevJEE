package tn.esprit.vm;

import java.io.Serializable;

public class LoginVM implements Serializable {
	private static final long serialVersionUID = 1L;

	private String Email;
	private String Password;
	private Boolean RememberMe;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Boolean getRememberMe() {
		return RememberMe;
	}
	public void setRememberMe(Boolean rememberMe) {
		RememberMe = rememberMe;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public LoginVM() {
		super();
	}
	@Override
	public String toString() 
	{
		return "LoginVM [Email=" + Email + ", Password=" + Password + ", RememberMe=" + RememberMe + "]";
	}
	
	
}
