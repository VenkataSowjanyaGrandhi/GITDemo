package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before the test suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After the test suite");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("I'll print this before every test method");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("I'll print this before every test");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("I'll print this after every test");
	}
	
	
	
	@Test
	public void webLoginCarLoan()
	{
		System.out.println("Web login car");
	}

	@Test(dependsOnMethods= {"webLoginCarLoan"})
	public void mobileLoginCarLoan()
	{
		System.out.println("mobile login car");
	}
	
	@Parameters({"URL","username"})
	@Test(groups= {"smoke"})
	public void apiLoginCarLoan(String urlname, String username)
	{
		System.out.println("api login car");
		System.out.println(urlname);
		System.out.println(username);
	}
}
