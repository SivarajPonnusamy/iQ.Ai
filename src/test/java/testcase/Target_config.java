package testcase;

import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.TargetConfig;

public class Target_config extends Base_test {
	@Test
	public void targetconfig() throws InterruptedException {
		TargetConfig config = new TargetConfig(driver);
		config.adminSettings();
		config.settingS();
		config.addorgCard();
		//config.sidebarOrg();
		
		config.orgList();
		
		config.targetConfig();
		
		config.erpConfig();
		Thread.sleep(3000);
		config.typesofERP();
		config.urL();
		config.erpUsername();
		config.erpPwd();
		//config.erpTest();
		config.erpSave();
		Thread.sleep(3000);
	}

}
