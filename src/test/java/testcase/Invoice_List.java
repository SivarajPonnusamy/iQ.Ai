package testcase;

import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.InvoiceList;


public class Invoice_List extends Base_test{
	@Test
	public static void Invoicelist() throws InterruptedException {
		InvoiceList process = new InvoiceList(driver);
		Thread.sleep(6000);
		
		process.invNavigation();
		process.orgLayout();
		
		//process.invoicelistExceptionpage();
		
		//process.invoiceNavigation();
		Thread.sleep(3000);
		//process.layoutSelection();
		//Thread.sleep(3000);
		process.totalPages();
		process.taskCreation();
		Thread.sleep(3000);
		
		
		
	}


}
