package myfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	
	public WebDriver driver;

	@BeforeTest
	public void callmefirst()
	{
		System.setProperty("webdriver.gecko.driver","D:\\seleniumfile\\geckodriver-v0.21.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@AfterTest
	public void afterMethod() {
		driver.quit();
	}
	
	@Test
	
	public void runProgram()
	{
		driver.get("https://www.google.com");
		System.out.println("My Name is Amit");	
	}

}
