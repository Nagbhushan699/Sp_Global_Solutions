package com.tdit.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateSecurity {
	WebDriver driver;
	public UpdateSecurity(WebDriver driver) {
		this.driver=driver;
	}
	private By title=By.xpath("//h2[text()='Update Security']");
	private By secNo=By.id("myInput");
	private By eod=By.name("sv");
	private By update_Security=By.name("register");

	public String getTitle() {
		return driver.findElement(title).getText();
	}
	public String enterSecNo(String no) {
		driver.findElement(secNo).clear();
		driver.findElement(secNo).sendKeys(no);
		return driver.findElement(secNo).getAttribute("value");
	}
	public String enterEod(String price) {
		driver.findElement(eod).clear();
		driver.findElement(eod).sendKeys(price);
		return driver.findElement(eod).getAttribute("value");
	}
	public String updateSecurity(String no,String eodPrice) {
		enterSecNo(no);
		enterEod(eodPrice);
		driver.findElement(update_Security).click();
		Alert alert=driver.switchTo().alert();
		return alert.getText();
	}
}
