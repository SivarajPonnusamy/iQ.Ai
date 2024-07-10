package testcase;

import org.testng.annotations.Test;

import base.Base_test;
import pageObjects.ExchangeRate;

public class Exchange_Rate extends Base_test{
	@Test
	public void exchangerate() throws InterruptedException {
		ExchangeRate er= new ExchangeRate(driver);
		er.exchangerateSideBar();
		er.currencyDropdown();
		er.addvendorCurrency();
		
		Thread.sleep(5000);
		
	}
	

}
