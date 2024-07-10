package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.Adduser;
import pageObjects.UserUpdate;

public class User_Update extends Base_test{
	@Test
	public  void userUpdation() throws InterruptedException {
		UserUpdate uu= new UserUpdate(driver);
		uu.adminSettings();
		uu.settingS();
		uu.inviteUsers();
		uu.userslist();
		Thread.sleep(5000);

	}

}
