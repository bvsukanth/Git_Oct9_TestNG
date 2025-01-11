package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homePage2 {
	
	@AfterMethod
	public void AfterMethodRun()
	{
		System.out.println("Hello From After Method Run");
	}

	
	@AfterClass
	public void AfterClassRun()
	{
		System.out.println("Hello from After Class run");
	}
	
	@Test
	public void HomePageModule2TestCase4()
	{
		System.out.println("Hello from Home Page Test Case 4");
	}
	
	@Test
	public void HomePageModule2TestCase5()
	{
		System.out.println("Hello from Home Page Test Case 5");
	}
	
	@Test (groups = {"Smoke"})
	public void HomePageModule3TestCase6()
	{
		System.out.println("Hello from Home Page Test Case 6");
	}
	
	@BeforeClass
	public void BeforeClassRun()
	{
		System.out.println("Hello from Before Class run");
	}
	
	@BeforeMethod
	public void BeforeMethodRun()
	{
		System.out.println("Hello From Before Method Run");
	}
}
