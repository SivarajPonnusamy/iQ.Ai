package testcase;

import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.TransferOwnership;

class Transfer_ownership extends Base_test {
	@Test
	public void transferownership() throws InterruptedException {
		TransferOwnership to = new TransferOwnership(driver);
		to.adminSettings();
		to.settingS();
		to.transfercard();
		to.usersDropdown();
		to.savebutton();
		Thread.sleep(5000);
		to.transferredUserLogin("saxurihi@finews.biz", "Test@123");
		Thread.sleep(6000);
		}
	
	

}