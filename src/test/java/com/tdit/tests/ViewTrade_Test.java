package com.tdit.tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.tdit.basetest.BaseTest;
import com.tdit.page.Homepage;
import com.tdit.page.Loginpage;
import com.tdit.page.ViewTrade;

public class ViewTrade_Test extends BaseTest {
	static Logger log=Logger.getLogger(ViewTrade_Test.class);
	ViewTrade  view;
	@BeforeClass()
	public void before() {
		Loginpage login=baselogin.goToLogin();
		Homepage home=	login.doLogin("nbha1", "tdit@123");
		view=	home.goToViewTrade();
	}
	@Test()
	public void verifyAccno() {
	String actual=	view.getAccno("5678");
	log.info("actual result : "+actual);
	String expected="5678";
	log.info("expected result : "+expected);
	Assert.assertEquals(actual, expected);
	}
	@Test()
	public void verifyDownloadcsv() throws InterruptedException {
	boolean actual=	view.downloadCsv("5678");	
	log.info("actual result : "+actual);
	Assert.assertTrue(actual);
	}
}
