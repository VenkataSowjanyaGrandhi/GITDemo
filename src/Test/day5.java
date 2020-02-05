package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day5 {
	
	@Test(dataProvider="dataSet")
	//@Parameters({"URL","username"})
	public void testRunData(String urlname,String username)
	{
		System.out.println("To test the data run");
		System.out.println(urlname);
		System.out.println(username);
		
	}

	@DataProvider
	public Object[][] dataSet()
	{
			Object[][] data= new Object[3][2];
			
			data[0][0]="firstUserName";
			data[0][1]="firstPassword";
			
			data[1][0]="secondUserName";
			data[1][1]="secondPassword";
			
			data[2][0]="thirdUserName";
			data[2][1]="thirdPassword";
			return data;
	}
}
