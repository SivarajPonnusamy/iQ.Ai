package testcase;

import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.RemoveDemoData;

public class Remove_Demo_data extends Base_test{
	@Test
	public void removeDemoData() throws InterruptedException {
		RemoveDemoData rd = new RemoveDemoData(driver);
		rd.adminSettings();
		rd.settingS();
		rd.demoCard();
		Thread.sleep(3000);
		rd.confirmButton();
		Thread.sleep(5000);
		
	}

}
