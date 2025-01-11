package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class signUpTest {
	
	@Test (groups = {"Regression"})
	public void signUpTestCase1()
	{
		System.out.println("Hello from SignUp Page Test Case 1");
		Assert.assertTrue(false);
	}
	
	@Test (groups = {"Smoke"})
	public void signUpTestCase2()
	{
		System.out.println("Hello from SignUp Page Test Case 2");
	}
	
	@Test (groups = {"Smoke"})
	public void signUpTestCase3()
	{
		System.out.println("Hello from SignUp Page Test Case 3");
	}
	
	@AfterSuite
	public void AfterSuiteMethod()
	{
		System.out.println("Hello from After Suite");
	}

}
