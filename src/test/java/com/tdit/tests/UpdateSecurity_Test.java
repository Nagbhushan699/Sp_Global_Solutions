package com.tdit.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.tdit.basetest.BaseTest;
import com.tdit.page.Homepage;
import com.tdit.page.Loginpage;
import com.tdit.page.UpdateSecurity;

public class UpdateSecurity_Test extends BaseTest{
	static Logger log=Logger.getLogger(UpdateSecurity_Test.class);
	UpdateSecurity  update;
	@BeforeClass()
	public void before() {
		Loginpage login=baselogin.goToLogin();
		Homepage home=	login.doLogin("nbha1", "tdit@123");
		update=	home.goToUpdateSecurity();
	}
	@Test()
	public void verifyNewFunds() {
		String actual=	   update.enterSecNo("3566");
		log.info("actual result : "+actual);
		String expected="3566";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test()
	public void verifyAccNo() {
		String actual=update.enterEod("10");
		log.info("actual result : "+actual);
		String expected="10";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test()
	public void verifyUpdateBalance() throws InterruptedException {
		String actual=update.updateSecurity("3566","10");
		log.info("actual result : "+actual);
		String expected="Security updated.. ";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
}
