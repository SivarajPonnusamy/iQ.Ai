package testcase;

import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.WorkflowAutomation;

public class Workflow_Automation extends Base_test{
	@Test
	public void workflowAutomation() throws InterruptedException {
		WorkflowAutomation wa = new WorkflowAutomation(driver);
		wa.adminSettings();
		wa.settingS();
		wa.workflowautomationcard();
		wa.orgLayout();
		Thread.sleep(3000);
		wa.doctype();
		wa.addnewStatus();
		wa.savebutton();
		Thread.sleep(5000);
	}

}
