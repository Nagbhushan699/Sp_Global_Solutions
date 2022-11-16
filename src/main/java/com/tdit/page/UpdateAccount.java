package com.tdit.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateAccount {
	WebDriver driver;
	public UpdateAccount(WebDriver driver) {
		this.driver=driver;
	}
	private By title=By.xpath("//h2[text()='Update Balance']");
	private By accNo=By.id("myInput");
	private By newFund= By.name("afund");
	private By updateBalance=By.name("register");

	public String getTitle() {
		return driver.findElement(title).getText();
	}
	public String enterNewFunds(String fund) {
		driver.findElement(newFund).clear();
		driver.findElement(newFund).sendKeys(fund);
		return driver.findElement(newFund).getAttribute("value");
	}
	public String enterAccNo(String no) {
		driver.findElement(accNo).clear();
		driver.findElement(accNo).sendKeys(no);
		return driver.findElement(accNo).getAttribute("value");
	}
	public String updateBalance(String accNo,String fund) throws InterruptedException {
		enterAccNo(accNo);
		enterNewFunds(fund);
		driver.findElement(updateBalance).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		return alert.getText();
	}
}
