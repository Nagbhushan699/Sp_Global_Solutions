package com.tdit.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.tdit.basetest.BaseTest;
import com.tdit.page.DeleteSecurity;
import com.tdit.page.Homepage;
import com.tdit.page.Loginpage;

public class DeleteSecurity_Test extends BaseTest{
	static Logger log=Logger.getLogger(DeleteSecurity_Test.class);
	DeleteSecurity  delete;
	@BeforeClass()
	public void before() {
		Loginpage login=baselogin.goToLogin();
		Homepage home=	login.doLogin("nbha1", "tdit@123");
		delete=	home.goToDeleteSecurity();
	}
	
	@Test(priority = -1)
	public void verifySecurityNo() {
		String actual=delete.enterSecurityNo("abdgr$254");
		log.info("actual result : "+actual);
		String expected="abdgr$254";
		Assert.assertEquals(actual, expected);
	}
	@Test()
	public void verifyDeleteSecurityNo() throws InterruptedException {
		String actual=delete.deleteAcc("abdgr$254");
		log.info("actual result : "+actual);
		String expected="Security deleted.. ";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
}
