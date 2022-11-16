package com.tdit.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.tdit.basetest.BaseTest;
import com.tdit.page.Homepage;
import com.tdit.page.Loginpage;
import com.tdit.page.UpdateAccount;

public class UpdateAccount_Test extends BaseTest {
	static Logger log=Logger.getLogger(UpdateAccount_Test.class);
	UpdateAccount  update;
	@BeforeClass()
	public void before() {
		Loginpage login=baselogin.goToLogin();
		Homepage home=	login.doLogin("nbha1", "tdit@123");
		update=	home.goToUpdateAccount();
	}
	@Test()
	public void verifyNewFunds() {
		String actual=	   update.enterNewFunds("12900");
		log.info("actual result : "+actual);
		String expected="12900";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test()
	public void verifyAccNo() {
		String actual=update.enterAccNo("909192");
		log.info("actual result : "+actual);
		String expected="909192";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test()
	public void verifyUpdateBalance() throws InterruptedException {
		String actual=update.updateBalance("909192","12900");
		log.info("actual result : "+actual);
		String expected="Balance updated.. ";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	
}
