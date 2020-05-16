package bdd.ups.utilities;

import cucumber.api.java.After;

public class AfterAction {
	
	@After
	public void afterAction () {
		SetupDrivers.tearDownChromeDriver();
		
	}

}
