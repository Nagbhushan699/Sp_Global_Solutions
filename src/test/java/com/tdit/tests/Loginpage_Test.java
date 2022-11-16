package com.tdit.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.tdit.basetest.BaseTest;
import com.tdit.page.Homepage;
import com.tdit.page.Loginpage;

public class Loginpage_Test  extends BaseTest{
	static Logger log=Logger.getLogger(Loginpage_Test.class);
	Loginpage login;
	@BeforeClass()
	public void before() {
		login=baselogin.goToLogin();
	}

	@Test(priority=1)
	public void verifyUsername() {
	String actual =	login.enterUsername("nbha1");
	log.info("actual result : "+actual);
	String expected="nbha1";
	log.info("expected result : "+expected);
	Assert.assertEquals(actual, expected);
	}
	@Test(priority=2)
	public void verifyPassword() {
	String actual=	login.enterPassword("tdit@123");
	log.info("actual result : "+actual);
	String expected="tdit@123";
	log.info("expected result : "+expected);
	Assert.assertEquals(actual, expected);
	}
	@Test(priority=3)
	public void verifyLogin() {
		login.doLogin("nbha1", "tdit@123");
		Homepage home=new Homepage(driver);
		String actual=home.getTitle();
		log.info("actual result : "+actual);
		String expected="TDIT Solutions";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
	}
}
