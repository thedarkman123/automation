package utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebDriverWrapper {

	RemoteWebDriver remoteWebDriver;

	public void init(String remoteUrl) throws MalformedURLException {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		remoteWebDriver = new RemoteWebDriver(new URL(remoteUrl), capabilities);
		remoteWebDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void init() {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		remoteWebDriver = new RemoteWebDriver(capabilities);
	}

	public void openUrl(String url) {
		remoteWebDriver.get(url);
	}

	
	public WebElement getElementByType(String value, String type, String condition) {

		WebElement element = null;

		By by = null;

		if (type.equals("xpath")) {
			by = By.xpath(value);
		} else if (type.equals("id")) {
			by = By.id(value);
		}

		try {
			WebDriverWait driverWait = new WebDriverWait(remoteWebDriver, 20, 1000);

			if (condition.equals("clickable")) {
				element = driverWait.until(ExpectedConditions.elementToBeClickable(by));
			} else if (condition.equals("visible")) {
				element = driverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
			}

		} catch (TimeoutException e) {
			System.out.println("");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (element == null) {
			Assert.fail();
		}

		return element;

	}

	public WebElement get_Element(By by) {
		WebElement element = remoteWebDriver.findElement(by);

		if (element != null) {
			return element;
		} else
			return null;

	}

	public void quit() {
		remoteWebDriver.quit();
	}

	
//	public int getElemenetsByXpath(String xpath) {
//		WebDriverWait driverWait = new WebDriverWait(remoteWebDriver, 20, 1000);
//
//		List<WebElement> elementsList = driverWait
//				.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(xpath), 1));
//
//		if (elementsList != null) {
//			return elementsList.size();
//		} else
//			return 0;
//	}

}
