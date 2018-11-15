package testcases;

import org.testng.annotations.Test;

import dataprov.Dataproviders;
import pageobjects.PageObject;

public class TestTesting extends BaseTest {
	
	@Test(dataProvider="excelData",dataProviderClass=Dataproviders.class)
	public void firstTest(String firstName) {
		System.out.println(firstName);
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
