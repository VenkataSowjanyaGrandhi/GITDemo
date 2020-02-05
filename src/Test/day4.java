package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
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
	
	@Test(groups= {"smoke"})
	public void webLoginHomeLoan()
	{
		System.out.println("Web login home");
	}

	@Parameters({"URL"})
	@Test
	public void mobileSigninHomeLoan(String Urlname)
	{
		System.out.println("mobile signin home");
		System.out.println(Urlname);
	}
	@Test
	public void mobileSignoutHomeLoan()
	{
		System.out.println("mobile signout home");
	}
	@Test
	public void mobileLoginHomeLoan()
	{
		System.out.println("mobile login home");
	}
	
	@Test
	public void apiLoginHomeLoan()
	{
		System.out.println("api login home");
	}

}
