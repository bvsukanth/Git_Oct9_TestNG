package TestNGPackage;


import org.testng.annotations.Test;

public class checkOutTest {

	
	@Test(priority = 4)
	public void HomePageModule2TestCase11()
	{
		System.out.println("Hello from Home Page Test Case 11");
	}
	
	@Test(priority = 3)
	public void HomePageModule2TestCase12()
	{
		System.out.println("Hello from Home Page Test Case 12");
	}
	

	@Test (priority = 2)
	public void HomePageModule3TestCase13()
	{
		System.out.println("Hello from Home Page Test Case 13");
	}
	
	@Test (priority = 1)
	public void HomePageModule3TestCase14()
	{
		System.out.println("Hello from Home Page Test Case 14");
	}
	
	
}
