package bdd.ups.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.ups.pageElements.UpsTrackingPageElement;
import bdd.ups.utilities.SetupDrivers;

public class UpsTrackingPageAction {
	UpsTrackingPageElement trackingPageElement;

	public UpsTrackingPageAction() {
		this.trackingPageElement = new UpsTrackingPageElement();
		PageFactory.initElements(SetupDrivers.chromeDriver, trackingPageElement);

	}

	public void getUpsTrackingPage() {

		SetupDrivers.chromeDriver.get("https://www.ups.com/track?loc=en_US&requester=ST/");
		SetupDrivers.chromeDriver.manage().window().maximize();
		SetupDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDrivers.chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void inputTrackingNumber(String str) {
		trackingPageElement.trackingNumber.sendKeys(str);

	}

	public void trackButton() {
		trackingPageElement.trackBtn.click();

	}

	public String errorMessage() {
		return trackingPageElement.errorMessage.getText();

	}

	public String upsTrackingPageTitle() {
		String UpsTrackingPageTitle = SetupDrivers.chromeDriver.getTitle();
		return UpsTrackingPageTitle;

	}

	public String upsHomePageTitle() {
		String UpsHomePageTitle = SetupDrivers.chromeDriver.getTitle();
		return UpsHomePageTitle;

	}
}
