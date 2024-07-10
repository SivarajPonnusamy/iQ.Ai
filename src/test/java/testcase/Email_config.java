package testcase;

import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.EmailConfig;

public class Email_config extends Base_test {

	@Test
	public void emailConfig() throws InterruptedException {
		EmailConfig email = new EmailConfig(driver);
		//email.sideBarOrg();
		email.adminSettings();
		email.settingS();
		email.addorgCard();
		email.orgList();
		Thread.sleep(3000);
		email.emailConfig();
		Thread.sleep(3000);
		//email.emailConfigList();
	}
}
