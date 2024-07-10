package testcase;

import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.MonthClosing;

public class Month_Closing extends Base_test{
	@Test
	public void monthclosing() throws InterruptedException {
		
		MonthClosing mc = new MonthClosing(driver);
		mc.monthclosingSideBar();
		mc.orgLayout();
		mc.monthopened();
		mc.updateButton();
		Thread.sleep(4000);
	}

}
