package testcases;

import org.testng.annotations.Test;

import pageobjects.PageObject;

public class TestTesting extends BaseTest {
	
	@Test
	public void firstTest() {
		log.debug("initiate site entering");
		PageObject.btcGainRegistration.openUrl();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
