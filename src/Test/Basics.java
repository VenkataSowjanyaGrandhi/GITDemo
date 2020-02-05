package Test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics extends TestBase {
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("I'll print this before every test");
	}
	
	
	
	@Test
	public void Demo() throws IOException
	{
		Login();
		System.out.println("Hello");
	}
	
	@Test
	public void SecondTest()
	
	{
		System.out.println("Bye");
	}

}
