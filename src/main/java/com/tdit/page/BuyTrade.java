package com.tdit.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyTrade {
WebDriver driver;
	public BuyTrade(WebDriver driver) {
		this.driver=driver;
	}
	private By title=By.xpath("//h4[text()='Buy Trade ']");
	private By accNo=By.id("acc_number");
	private By securityNo=By.name("snumber");
	private By noOfShares=By.name("n");
	private By purchasePrice=By.name("pp");
	private By addTrade=By.name("add_trade");
	public String buyTrade(String accno,String secNo,String shares,String price) {
		driver.findElement(accNo).sendKeys(accno);
		driver.findElement(securityNo).sendKeys(secNo);
		driver.findElement(noOfShares).sendKeys(shares);
		driver.findElement(purchasePrice).sendKeys(price);
		driver.findElement(addTrade).click();
		Alert alert=driver.switchTo().alert();
		return alert.getText();
	}
	
	
	public String getTitle() {
		return driver.findElement(title).getText();
	}
}
