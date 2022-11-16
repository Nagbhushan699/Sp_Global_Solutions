package com.tdit.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SellTrade {
	WebDriver driver;
	public SellTrade(WebDriver driver) {
		this.driver=driver;
	}
	private By title=By.xpath("//h4[text()='Sell Trade ']");
	private By accNo=By.id("acc_number");
	private By securityNo=By.name("snumber");
	private By noOfShares=By.name("n");
	private By sellPrice=By.name("sp");
	private By sellTrade=By.name("add_trade");
	public String sellTrade(String accno,String secNo,String shares,String price) {
		driver.findElement(accNo).sendKeys(accno);
		driver.findElement(securityNo).sendKeys(secNo);
		driver.findElement(noOfShares).sendKeys(shares);
		driver.findElement(sellPrice).sendKeys(price);
		driver.findElement(sellTrade).click();
		Alert alert=driver.switchTo().alert();
		return alert.getText();
	}
	
	
	public String getTitle() {
		return driver.findElement(title).getText();
	}
}
