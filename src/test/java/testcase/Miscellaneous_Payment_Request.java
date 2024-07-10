package testcase;

import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.MiscellaneousPaymentRequest;

public class Miscellaneous_Payment_Request extends Base_test{
	@Test
	public void miscellaneousRequest() throws InterruptedException {
		MiscellaneousPaymentRequest mr = new MiscellaneousPaymentRequest(driver);
		mr.invoicenavigation();
		Thread.sleep(6000);
		
		
	}

}
