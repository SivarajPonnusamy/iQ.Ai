package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.AdvanceRequest;

public class Advance_Request extends Base_test {
	@Test
	public void advanceRquest() throws InterruptedException {
		AdvanceRequest ar = new AdvanceRequest(driver);
		
		ar.advancerequestnavigation();
		Thread.sleep(6000);
		ar.orgLayout();
		Thread.sleep(4000);
		ar.createMobilisation();
		Thread.sleep(4000);
		ar.savebutton();
		Thread.sleep(4000);
	}

}
