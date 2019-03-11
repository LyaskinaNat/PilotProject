package pageObjects;



public class loginPage  {
	
public String signInButton = "//a[@title='Log in to your customer account']"; // xPath locator

public String email = "email"; //id locator

public String password = "passwd"; //id locator

public String submit = "SubmitLogin"; //id locator

public String userSignedIn = "//a[@title='View my customer account']";

public String authFailed = "//li[contains(text(),'Authentication failed.')]";

public String invalidEmail = "//li[contains(text(),'Invalid email address.')]";

	

}

