package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	
	@Parameters({"URL","username"})
	@Test(groups= {"smoke"})
	public void Loan(String urlname,String username)
	{
		System.out.println("loan");
		System.out.println(urlname);
		System.out.println(username);
	}
	
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
}
