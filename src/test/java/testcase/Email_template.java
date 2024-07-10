package testcase;

import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.EmailTemplate;
import pageObjects.Profile;

public class Email_template extends Base_test {
	EmailTemplate em;
	
	@Test
	public void emailTemplate() throws InterruptedException {
		em = new EmailTemplate(driver);
		em.adminSettings();
		em.settingS();
		em.sidebartskmgmt();
		em.mailTemplate();
		Thread.sleep(3000);
		
		}
	

}
