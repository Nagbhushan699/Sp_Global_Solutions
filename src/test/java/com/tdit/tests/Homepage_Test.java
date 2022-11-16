package com.tdit.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.tdit.basetest.BaseTest;
import com.tdit.page.AddAccount;
import com.tdit.page.AddSecurity;
import com.tdit.page.BuyTrade;
import com.tdit.page.DeleteAccount;
import com.tdit.page.DeleteSecurity;
import com.tdit.page.Homepage;
import com.tdit.page.Loginpage;
import com.tdit.page.SellTrade;
import com.tdit.page.UpdateAccount;
import com.tdit.page.UpdateSecurity;
import com.tdit.page.ViewTrade;

public class Homepage_Test extends BaseTest{
	static Logger log=Logger.getLogger(Homepage_Test.class);
	Homepage homepage;
	@BeforeClass()
	public void before() {
		Loginpage login=baselogin.goToLogin();
		homepage=login.doLogin("nbha1", "tdit@123");
	}
	@Test()
	public void verifyViewTradeTitle() {
		ViewTrade view=	homepage.goToViewTrade();
		String actual=view.getTitle();
		log.info("actual result : "+actual);
		String expected="View Trades";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().back();
	}
	@Test()
	public void verifyBuyTradeTitle() {
		
		BuyTrade buy=homepage.goToBuyTrade();
		String actual=buy.getTitle();
		log.info("actual result : "+actual);
		String expected="Buy Trade";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().back();
	}
	@Test()
	public void verifySellTradeTitle() {
	
		SellTrade sell=homepage.goToSellTrade();
		String actual=sell.getTitle();
		log.info("actual result : "+actual);
		String expected="Sell Trade";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().back();
	}
	@Test()
	public void verifyAddAccountTitle() {
	
		AddAccount add=homepage.goToAddAccount();
		String actual=add.getTitle();
		log.info("actual result : "+actual);
		String expected="Add Account";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().back();
	}
	@Test()
	public void verifyUpdateAccountTitle() {
		UpdateAccount update=homepage.goToUpdateAccount();
		String actual=update.getTitle();
		log.info("actual result : "+actual);
		String expected="Update Balance";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().back();
	}
	@Test()
	public void verifyDeleteAccountTitle() {
		DeleteAccount delete=homepage.goToDeleteAccount();
		String actual=delete.getTitle();
		log.info("actual result : "+actual);
		String expected="Delete Account";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().back();
	}
	@Test()
	public void verifyAddSecurityTitle() {
		AddSecurity add=homepage.goToAddSecurity();
		String actual=add.getTitle();
		log.info("actual result : "+actual);
		String expected="Add Security";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().back();
	}
	@Test()
	public void verifyUpdateSecurityTitle() {
		UpdateSecurity update=homepage.goToUpdateSecurity();
		String actual=update.getTitle();
		log.info("actual result : "+actual);
		String expected="Update Security";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().back();
	}
	@Test()
	public void verifyDeleteSecurityTitle() {
		DeleteSecurity update=homepage.goToDeleteSecurity();
		String actual=update.getTitle();
		log.info("actual result : "+actual);
		String expected="Delete Security";
		log.info("expected result : "+expected);
		Assert.assertEquals(actual, expected);
		driver.navigate().back();
	}
	
}
