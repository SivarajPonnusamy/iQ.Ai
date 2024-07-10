package testcase;

import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.DocumentTypeSetup;

public class Document_typeSetup extends Base_test {
	
	@Test
	public void docsetUP() throws InterruptedException {
		DocumentTypeSetup doc= new DocumentTypeSetup(driver);
			doc.adminSettings();
			doc.settingS();
			doc.doctypesetupcard();
			doc.doctype();
			Thread.sleep(4000);
			doc.docCode();
			Thread.sleep(3000);
			doc.glIndicator();
			doc.savebutton();
			Thread.sleep(3000);
		
	}

}
