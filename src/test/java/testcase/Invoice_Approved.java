package testcase;

import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.InvoiceApproved;

public class Invoice_Approved extends Base_test {
	@Test
	public static void invoiceApproved() throws InterruptedException {
		InvoiceApproved invapp = new InvoiceApproved(driver);
		Thread.sleep(3000);
		invapp.invNavigation();
		invapp.orgLayout();
		invapp.invoiceSelection();
		Thread.sleep(4000);
		invapp.approved();
		Thread.sleep(7000);
		
		
	}
}
