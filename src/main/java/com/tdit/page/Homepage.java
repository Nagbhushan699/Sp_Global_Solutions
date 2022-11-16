package com.tdit.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
WebDriver driver;
public Homepage(WebDriver driver) {
	this.driver=driver;
}
 By title=By.tagName("h2");
private By viewTrade=By.xpath("//a[text()='View Trade']");
private By buyTrade=By.xpath("//a[text()='Buy Trade']");
private By sellTrade=By.xpath("//a[text()='Sell Trade']");
private By addAccount=By.xpath("//a[text()='Add Account']");
private  By updateAccount=By.xpath("//a[text()='Update Account']");
private By deleteAccount=By.xpath("//a[text()='Delete Account']");
private By addSecurity=By.xpath("//a[text()='Add Security']");
private By updateSecurity=By.xpath("//a[text()='Update security']");
private By deleteSecurity=By.xpath("//a[text()='Delete security']");

//page Actions
public ViewTrade goToViewTrade() {
	driver.findElement(viewTrade).click();
	return new ViewTrade(driver);
}
public BuyTrade goToBuyTrade() {
	driver.findElement(buyTrade).click();
	return new BuyTrade(driver);
}
public SellTrade goToSellTrade() {
	driver.findElement(sellTrade).click();
	return new SellTrade(driver);
}
public AddAccount goToAddAccount() {
	driver.findElement(addAccount).click();
	return new AddAccount(driver);
}
public UpdateAccount goToUpdateAccount() {
	driver.findElement(updateAccount).click();
	return new UpdateAccount(driver);
}
public DeleteAccount goToDeleteAccount() {
	driver.findElement(deleteAccount).click();
	return new DeleteAccount(driver);
}
public AddSecurity goToAddSecurity() {
	driver.findElement(addSecurity).click();
	return new AddSecurity(driver);
}
public UpdateSecurity goToUpdateSecurity() {
	driver.findElement(updateSecurity).click();
	return new UpdateSecurity(driver);
}
public DeleteSecurity goToDeleteSecurity() {
	driver.findElement(deleteSecurity).click();
	return new DeleteSecurity(driver);
}
public String getTitle() {
	return driver.findElement(title).getText();
}
}
