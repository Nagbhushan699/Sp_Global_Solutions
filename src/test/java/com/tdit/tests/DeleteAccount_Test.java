package com.tdit.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.tdit.basetest.BaseTest;
import com.tdit.page.DeleteAccount;
import com.tdit.page.Homepage;
import com.tdit.page.Loginpage;

public class DeleteAccount_Test extends BaseTest {
	static Logger log=Logger.getLogger(DeleteAccount_Test.class);
	DeleteAccount  delete;
	@BeforeClass()
	public void before() {
		Loginpage login=baselogin.goToLogin();
		Homepage home=	login.doLogin("nbha1", "tdit@123");
		delete=	home.goToDeleteAccount();
	}
	
	@Test()
	public void verifyAccNo() {
		String actual=delete.enterAccNo("345678");
		log.info("actual result : "+actual);
		String expected="345678";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
	@Test()
	public void verifyDeleteAcc() throws InterruptedException {
		String actual=delete.deleteAcc("345678");
		log.info("actual result : "+actual);
		String expected="Account Deleted ";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}

}
