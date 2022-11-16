package com.tdit.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.tdit.basetest.BaseTest;
import com.tdit.page.AddSecurity;
import com.tdit.page.Homepage;
import com.tdit.page.Loginpage;

public class AddSecurity_Test extends BaseTest {
	static Logger log=Logger.getLogger(AddSecurity_Test.class);
	AddSecurity add;
	@BeforeClass()
	public void before() {
	Loginpage login=baselogin.goToLogin();
	Homepage home=login.doLogin("nbha1", "tdit@123");
	add=home.goToAddSecurity();
	}
	@Test()
	public void verifyAddAcc() throws InterruptedException {
	String actual=	add.addSecurity("3566","55","150","10-3-2022","10");
	log.info("actual result : "+actual);
	String expected="Security Registered.. ";
	log.info("expected result : "+expected);
	Assert.assertEquals(actual, expected);
	}
}
