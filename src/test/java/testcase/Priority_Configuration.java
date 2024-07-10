package testcase;

import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.PriorityConfiguration;

public class Priority_Configuration extends Base_test{
	PriorityConfiguration pc;
	@Test
	public void priorityConfig() throws InterruptedException {
	pc =new PriorityConfiguration(driver);
	pc.adminSettings();
	pc.settingS();
	pc.configprioritesCard();
	Thread.sleep(5000);
	pc.radioButton();
	Thread.sleep(5000);
	}
}
