package com.tdit.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.tdit.basetest.BaseTest;
import com.tdit.page.Homepage;
import com.tdit.page.Loginpage;
import com.tdit.page.SellTrade;

public class SellTrade_Test extends BaseTest {
	static Logger log=Logger.getLogger(SellTrade_Test.class);
	SellTrade  sell;
	@BeforeClass()
	public void before() {
		Loginpage login=baselogin.goToLogin();
		Homepage home=	login.doLogin("nbha1", "tdit@123");
		sell=	home.goToSellTrade();
	}
	@Test()
	public void verifyBuyTrade() {
	String actual=	sell.sellTrade("524697", "3566", "1", "10");
	log.info("actual result : "+actual);
	String expected="Sell Trade Successful";
	log.info("expected result : "+expected);
	Assert.assertEquals(actual, expected);
	}

}
