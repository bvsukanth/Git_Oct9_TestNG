package TestNGPackage;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginPage {

	
	@Test (enabled = false)
	public void HomePageModule2TestCase7()
	{
		System.out.println("Hello from Home Page Test Case 7");
	}
	
	@Test (dependsOnMethods = "HomePageModule3TestCase9")
	public void HomePageModule2TestCase8()
	{
		
		System.out.println("Hello from Home Page Test Case 8");
	}
	
	@Test (timeOut = 5000)
	public void HomePageModule3TestCase9()
	{
		
		System.out.println("Hello from Home Page Test Case 9");
	}
	
	
	@Parameters({"URL", "UserName","Password"})
	@Test 
	public void HomePageModule3TestCase10(String url, String username, String password)
	{
		
		System.out.println("Hello from Home Page Test Case 10");
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@Test (dataProvider = "getData")
	public void HomePageModule3TestCase11(String username, String password)
	{
		
		System.out.println("Hello from Home Page Test Case 11");
		System.out.println(username);
		System.out.println(password);
	
		//code here for correct uname and correct password
		//rest of code remains
		
	}
	
	/*
	 * @Test public void HomePageModule3TestCase12() {
	 * 
	 * System.out.println("Hello from Home Page Test Case 12");
	 * 
	 * //code here for correct uname and wrong password //rest of code remains
	 * 
	 * }
	 * 
	 * @Test public void HomePageModule3TestCase13() {
	 * 
	 * System.out.println("Hello from Home Page Test Case 13");
	 * 
	 * //code here for wrong uname and wrong password //rest of code remains
	 * 
	 * }
	 */
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "goodusername";
		data[0][1] = "goodpassword";
		
		data[1][0] = "goodusername";
		data[1][1] = "badpassword";
		
		data[2][0] = "badusername";
		data[2][1] = "goodpassword";
		
		return data;
	}
	
}
