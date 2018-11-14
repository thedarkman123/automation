package pageobjects;

import utilities.PropertiesWrapper;

public class PageObject {
	
	public static class btcGainRegistration extends GenericPageObject{
		public static void openUrl() {
			driverWrapper.openUrl(propertiesWrapper.getProp("webUrl"));
		}
	}
		
}
