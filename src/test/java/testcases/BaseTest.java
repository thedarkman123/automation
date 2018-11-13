package testcases;


import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pageobjects.GenericPageObject;
import utilities.WebDriverWrapper;
import utilities.PropertiesWrapper;

public class BaseTest {
	WebDriverWrapper driverWrapper;
	PropertiesWrapper config,or;
	Logger log = Logger.getLogger("appLogger");
	//initializations goes here
	@BeforeSuite
	public void setup() {
		//a wrapper for properties
		config = new PropertiesWrapper("Config");
		or     = new PropertiesWrapper("OR");
		log.debug("all is great");
		//a wrapper for the webdriver
		driverWrapper = new WebDriverWrapper();
		driverWrapper.init();

		GenericPageObject.setWebDriver(driverWrapper);
	}
	
	@AfterSuite
	public void teardown() {
		if (driverWrapper != null) {
			driverWrapper.quit(); //close the browser
		}
	}
}
