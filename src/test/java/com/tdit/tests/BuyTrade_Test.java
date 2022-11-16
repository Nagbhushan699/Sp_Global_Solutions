package com.tdit.tests;

import org.testng.Assert;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.tdit.basetest.BaseTest;
import com.tdit.page.BuyTrade;
import com.tdit.page.Homepage;
import com.tdit.page.Loginpage;

public class BuyTrade_Test extends BaseTest{
	static Logger log=Logger.getLogger(BuyTrade_Test.class);
	BuyTrade  buy;
	@BeforeClass()
	public void before() {
		Loginpage login=baselogin.goToLogin();
		Homepage home=	login.doLogin("nbha1", "tdit@123");
		buy=home.goToBuyTrade();
	}
	@Test()
	public void verifyBuyTrade() {
	String actual=	buy.buyTrade("524697", "3566", "15", "100");
	log.info("actual result : "+actual);
	String expected="Trade Added Successfully.. ";
	log.info("expected result : "+expected);
	Assert.assertEquals(actual, expected);
	}
}
