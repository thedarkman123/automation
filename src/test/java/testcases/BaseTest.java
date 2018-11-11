package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utilities.WebDriverWrapper;

public class BaseTest {
	WebDriverWrapper driverWrapper;
	//initializations goes here
	@BeforeSuite
	public void setup() {
		
	}
	
	@AfterSuite
	public void quit() {
		
	}
}
