package TestNGPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class homePage {
	
	@AfterTest
	public void AfterTestRun()
	{
		System.out.println("Hello from After Test");
	}

	
	@Test
	public void HomePageModule1TestCase1()
	{
		//LOgin
		System.out.println("Hello from Home Page Module1 Test Case 1");
		//Logout
	}
	
	@Test
	public void HomePageModule1TestCase2()
	{
		//LOgin
		System.out.println("Hello from Home Page Module1 Test Case 2");
		//Logout
	}
	
	@Test
	public void HomePageModule2TestCase3()
	{
		System.out.println("Hello from Home Page Module2 Test Case 3");
	}
	
	@BeforeSuite
	public void BeforeSuiteMethod()
	{
		System.out.println("Hello from Before Suite");
	}
	
	@BeforeTest
	public void BeforeTestRun()
	{
		System.out.println("Hello from Before Test");
	}
}



//BeforSuite - It runs before entire suite - Setup webdriver, env details - setup here
//AfterSuite - It runs after entire suite - close webdriver, remove any env details 

//BeforeTest - This to clean up data we have entered
//AfterTest - Delete cookies, close connections

//BeforeMethod - Login
//AfterMethod - Logout

//BeforeClass - initialize or configure the data for the test cases in that class
//AfterClass - remove configurations or the data for the test cases in that class

//BeforeSuite > BeforeTest > BeforeClass > BeforeMethod > @Test > AfterMethod > AfterClass > AfterTest > AfterSuite

//1 Test Suite -> 3 test folders -> Each test folder is having 4 classes -> Each class is having ten methods 

//Before and After Suite - Only once for the entire execution 
//For all test folders I have given Before test and After Test - 3 times Before test and 3 times after test
//For all classes I have given Before class and After class - 4 times before and 4 times after
//For all methods I have given Before method and After Method - 10 times before and 10 times after 

