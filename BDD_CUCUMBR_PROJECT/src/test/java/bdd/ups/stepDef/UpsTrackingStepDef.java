package bdd.ups.stepDef;

import org.testng.Assert;

import bdd.ups.pageAction.UpsTrackingPageAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpsTrackingStepDef {

	UpsTrackingPageAction upsTracking = new UpsTrackingPageAction();

	@Given("^UPS tracking page launched$")
	public void ups_tracking_page_launched() {
		upsTracking.getUpsTrackingPage();
		String expectedTitle = "Tracking | UPS - States";
		String actualTitle = upsTracking.upsTrackingPageTitle();

		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@When("^User inpute wrong TrackingNumber \"([^\"]*)\"$")
	public void user_inpute_wrong_TrackingNumber(String TrackingNumber) {
		upsTracking.inputTrackingNumber(TrackingNumber);

	}

	@When("^User click on track button$")
	public void user_click_on_track_button() {
		upsTracking.trackButton();

	}

	@Then("^User should reciver an error text$")
	public void user_should_reciver_an_error_text() {
		String actualErrorMessage = upsTracking.errorMessage();
		boolean bool = false;

		if (actualErrorMessage.contains("not locate the shipment details")) {

			bool = true;

		}
		
		Assert.assertEquals(bool, true);

	}

	@When("^User inpute Correct TrackingNumber W(\\d+)N(\\d+)NG(\\d+)A$")
	public void user_inpute_Correct_TrackingNumber_W_N_NG_A(String TrackingNumber) {
		
		upsTracking.inputTrackingNumber(TrackingNumber);


	}

	@Then("^User should be able to view tracking information$")
	public void user_should_be_able_to_view_tracking_information() {
		String expectedTitle = "Home | UPS - United States";
		String actualTitle = upsTracking.upsHomePageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@When("^User inpute Correct TrackingNumber D(\\d+)G(\\d+)NY(\\d+)B$")
	public void user_inpute_Correct_TrackingNumber_D_G_NY_B(int arg1, int arg2, int arg3) {

	}

	@When("^User inpute Correct TrackingNumber T(\\d+)H(\\d+)XNG(\\d+)P$")
	public void user_inpute_Correct_TrackingNumber_T_H_XNG_P(int arg1, int arg2, int arg3) {

	}

}
