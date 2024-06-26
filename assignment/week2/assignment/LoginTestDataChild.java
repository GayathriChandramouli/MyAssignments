package week2.assignment;

public class LoginTestDataChild extends TestDataParent {
	public void enterUsername() 
	{
		System.out.println("Please enter the username");
	}
	public void enterPassword() 
	{
		System.out.println("Please enter the password");
	}
	public static void main (String[] args) 
	{
		LoginTestDataChild logindata = new LoginTestDataChild();
		logindata.enterCredentials();
		logindata.navigateToHomePage();
		logindata.enterUsername();
		logindata.enterPassword();
		
	
	}

}
