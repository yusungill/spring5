package chap08.spring;

public class RegisterRequest {


	private String email;
	private String password;
	private String confirmPassword;
	private String name;
	
	
	
	public RegisterRequest(String email, String password, String confirmPassword, String name) {
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCongfirmPassword() {
		return confirmPassword;
	}
	public void setCongfirmPassword(String congfirmPassword) {
		this.confirmPassword = congfirmPassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isPasswordEqualToConfirmPassword() {
		return password.equals(confirmPassword);
	}

}