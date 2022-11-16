package com.tdit.tests;

import org.testng.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.tdit.basetest.BaseTest;
import com.tdit.page.AddAccount;
import com.tdit.page.Homepage;
import com.tdit.page.Loginpage;

public class AddAccount_Test extends BaseTest {
	static Logger log=Logger.getLogger(AddAccount_Test.class);
	AddAccount add;
	@BeforeClass()
	public void before() {
	Loginpage login=baselogin.goToLogin();
	Homepage home=login.doLogin("nbha1", "tdit@123");
	add=home.goToAddAccount();
	}
//	@Test(priority = -1)
//	public void verifyTitle() {
//	String actual=	add.getTitle();
//	String expected="Add Account";
//	Assert.assertEquals(actual, expected);
//	}
	@Test()
	public void verifyAccNo() {
	String actual=	add.enterAccNo("1235");
	log.info("actual result : "+actual);
	String expected="1235";
	log.info("expected result : "+expected);
	Assert.assertEquals(actual, expected);
	}
	@Test()
	public void verifyAccName() {
	String actual=	add.enterAccName("ram");
	log.info("actual result : "+actual);
	String expected="ram";
	log.info("expected result : "+expected);
	Assert.assertEquals(actual, expected);
	}
	@Test()
	public void verifyAccFund() {
	String actual=	add.enterAccFund("622");
	log.info("actual result : "+actual);
	String expected="622";
	log.info("expected result : "+expected);
	Assert.assertEquals(actual, expected);
	}
	@Test()
	public void verifyAddAcc() throws InterruptedException {
	String actual=	add.addAccountWithValidInputs("Vaibhav123","909192","15000");
	log.info("actual result : "+actual);
	String expected="Account Registered.. ";
	log.info("expected result : "+expected);
	Assert.assertEquals(actual, expected);
	}
}
