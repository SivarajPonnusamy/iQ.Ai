package testcase;

import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.TaskId;

public class Task_Id extends Base_test{
	@Test
	public void taskId() throws InterruptedException {
		TaskId ti = new TaskId(driver);
		ti.adminSettings();
		ti.settingS();
		ti.taskIdcard();
		ti.taskidconfig();
		Thread.sleep(4000);
		
	}

}