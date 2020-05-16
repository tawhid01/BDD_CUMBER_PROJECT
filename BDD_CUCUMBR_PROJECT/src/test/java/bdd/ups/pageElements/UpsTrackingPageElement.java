package bdd.ups.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpsTrackingPageElement {
	@FindBy(id = "stApp_trackingNumber")
	public WebElement trackingNumber;

	@FindBy(id = "stApp_btnTrack")
	public WebElement trackBtn;
	
	@FindBy (id= "stApp_error_alert_list0")
	public WebElement errorMessage;

	}


