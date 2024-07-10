package testcase;

import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.AccrualAccounting;

public class Accural_Accounting extends  Base_test{
	@Test
	public void accuralAccounting() throws InterruptedException {
		AccrualAccounting aa = new AccrualAccounting(driver);
		aa.accrualSideBar();
		Thread.sleep(6000);
		aa.accountingTable();
		Thread.sleep(6000);
		aa.accrualdate();
		aa.saveButton();
		
			
		
		
	}

}
