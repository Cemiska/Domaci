package domaci_20_09_2021;

import java.net.URL;

import org.openqa.selenium.WebDriver;

public class SadPath extends TestBase{

	private String errorUsername;
	private String errorPassword;
	

	public SadPath(String errorUsername, String errorPassword) {
		super();
		this.errorUsername = "nekiUsername";
		this.errorPassword = "nekaSifra";
	}


	public String getErrorUsername() {
		return errorUsername;
	}

	public void setErrorUsername(String errorUsername) {
		this.errorUsername = errorUsername;
	}

	public String getErrorPassword() {
		return errorPassword;
	}

	public void setErrorPassword(String errorPassword) {
		this.errorPassword = errorPassword;
	}

	@Override
	public String toString() {
		return this.errorUsername + ", " + this.errorPassword;
	}
	
	
	
}
