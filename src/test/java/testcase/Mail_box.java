package testcase;

import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.Mailbox;

public class Mail_box extends Base_test{
	Mailbox mail;
	@Test
	public void mailBox() throws InterruptedException {
		mail=new Mailbox(driver);
		mail.navigation2mailbox();
		mail.outlook_config();
		Thread.sleep(3000);
		mail.O365login();
		
	}
	
	

}
