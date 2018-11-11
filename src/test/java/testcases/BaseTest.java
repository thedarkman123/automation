package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pageobjects.GenericPageObject;
import utilities.WebDriverWrapper;

public class BaseTest {
	WebDriverWrapper driverWrapper;
	//initializations goes here
	@BeforeSuite
	public void setup() {
		driverWrapper = new WebDriverWrapper();
		driverWrapper.init();

		GenericPageObject.setWebDriver(driverWrapper);
	}
	
	@AfterSuite
	public void quit() {
		driverWrapper.quit(); //close the browser
	}
}
