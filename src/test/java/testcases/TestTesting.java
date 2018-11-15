package testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import dataprov.Dataproviders;
import pageobjects.PageObject;

public class TestTesting extends BaseTest {
	
	@Test(dataProvider="excelData",dataProviderClass=Dataproviders.class)
	public void firstTest(String firstName,String lastName) {
		System.out.println("firstname: "+firstName);
		System.out.println("lastname: "+lastName);
//		log.debug("initiate site entering");
//		PageObject.btcGainRegistration.openUrl();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	@Test
	public void secondsTest() {
		System.out.println("test2");
		Assert.fail();
//		log.debug("initiate site entering");
//		PageObject.btcGainRegistration.openUrl();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	@Test
	public void seconds3() {
		System.out.println("test3");
		Reporter.log("shalom mother fucker");
		Assert.assertEquals(true, true);
//		log.debug("initiate site entering");
//		PageObject.btcGainRegistration.openUrl();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
}
