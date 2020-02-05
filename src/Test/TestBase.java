package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {	
	
	
	public WebDriver driver=null;

	@Test
	public void Login() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Java Eclipse\\TestNGExercise\\src\\Test\\datadriven.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		if(prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("Webdriver.chrome.driver","c://Chromedriver.exe");
		 driver= new ChromeDriver();
		
		}
		else if(prop.getProperty("browser").equals("firefox"))
		{
			 driver= new FirefoxDriver();
		}
		else
		{
			driver= new InternetExplorerDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
		//driver.findElements(By.id("")).sendKeys();
	}
}
