package week3.assignment.SingleInheritance;

public class LoginTestData extends TestData {
	public void enterUsername()
	{
		System.out.println("entering username"+super.userName);
	}
	public void enterPassword()
	{
		System.out.println("etering password"+super.password);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData login=new LoginTestData();
		login.enterCredentials();
		login.userName="Naveen";
		login.password="Nav";
		login.enterUsername();
		login.enterPassword();

	}
	

}
